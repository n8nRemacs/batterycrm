package e11;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.adjust.sdk.Constants;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes7.dex */
public final class H extends AbstractC39860d0 {

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f394359c;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    public final Method f394360b;

    static {
        int[] iArr = {260, 272, 268, 276, 516, 520, 532, 528, 524, 512, 264, 256, 280};
        Arrays.sort(iArr);
        f394359c = iArr;
    }

    public H() {
        try {
            this.f394360b = BluetoothDevice.class.getMethod("isConnected", new Class[0]);
        } catch (Throwable unused) {
        }
    }

    @SuppressLint({"MissingPermission"})
    public final void g(@j.N Context context) {
        Method method = this.f394360b;
        if (method == null) {
            return;
        }
        if (!AbstractC39860d0.b(context, "android.permission.BLUETOOTH")) {
            e();
            return;
        }
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null || !defaultAdapter.isEnabled()) {
            e();
            return;
        }
        ArrayList arrayList = new ArrayList();
        try {
            for (BluetoothDevice bluetoothDevice : defaultAdapter.getBondedDevices()) {
                if (Arrays.binarySearch(f394359c, bluetoothDevice.getBluetoothClass().getDeviceClass()) < 0 && ((Boolean) method.invoke(bluetoothDevice, new Object[0])).booleanValue()) {
                    String name = bluetoothDevice.getName();
                    if (!TextUtils.isEmpty(name)) {
                        arrayList.add(new String(Base64.encode(name.getBytes(), 2), Constants.ENCODING));
                    }
                }
            }
        } catch (Throwable unused) {
        }
        a("bdn", !arrayList.isEmpty() ? TextUtils.join(",", arrayList) : null);
    }
}
