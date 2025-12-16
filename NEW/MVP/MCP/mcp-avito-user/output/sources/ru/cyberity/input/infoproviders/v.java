package ru.cyberity.input.infoproviders;

import Y61.k;
import Y61.l;
import android.hardware.input.InputManager;
import android.view.InputDevice;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import ru.cyberity.input.tools.threading.safe.c;

/* compiled from: InputDevicesInforProvider.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0006¨\u0006\n"}, d2 = {"Lru/cyberity/fingerprint/infoproviders/v;", "Lru/cyberity/fingerprint/infoproviders/u;", "", "Lru/cyberity/fingerprint/infoproviders/t;", "a", "Landroid/hardware/input/InputManager;", "Landroid/hardware/input/InputManager;", "inputDeviceManager", "<init>", "(Landroid/hardware/input/InputManager;)V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class v implements u {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final InputManager inputDeviceManager;

    /* compiled from: InputDevicesInforProvider.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Lru/cyberity/fingerprint/infoproviders/t;", "a", "()Ljava/util/List;"}, k = 3, mv = {1, 7, 1})
    public static final class a extends N implements Y41.a<List<? extends t>> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<t> invoke() {
            int[] inputDeviceIds;
            InputManager inputManager = v.this.inputDeviceManager;
            if (inputManager == null || (inputDeviceIds = inputManager.getInputDeviceIds()) == null) {
                return C42784z0.f406748b;
            }
            v vVar = v.this;
            ArrayList arrayList = new ArrayList(inputDeviceIds.length);
            for (int i12 : inputDeviceIds) {
                InputDevice inputDevice = vVar.inputDeviceManager.getInputDevice(i12);
                String strValueOf = String.valueOf(inputDevice != null ? Integer.valueOf(inputDevice.getVendorId()) : null);
                String name = inputDevice != null ? inputDevice.getName() : null;
                if (name == null) {
                    name = "";
                }
                arrayList.add(new t(name, strValueOf));
            }
            return arrayList;
        }
    }

    public v(@l InputManager inputManager) {
        this.inputDeviceManager = inputManager;
    }

    @Override // ru.cyberity.input.infoproviders.u
    @k
    public List<t> a() {
        Object objA = c.a(0L, new a(), 1, null);
        C42784z0 c42784z0 = C42784z0.f406748b;
        int i12 = Z.f406624c;
        if (objA instanceof Z.b) {
            objA = c42784z0;
        }
        return (List) objA;
    }
}
