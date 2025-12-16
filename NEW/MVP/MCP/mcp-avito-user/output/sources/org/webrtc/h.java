package org.webrtc;

import android.content.Context;
import android.os.Parcel;
import com.avito.android.remote.model.text.AttributedText;
import com.my.tracker.MyTracker;
import com.my.tracker.MyTrackerAttribution;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.collections.C42784z0;
import org.webrtc.EglThread;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class h implements EglThread.ReleaseMonitor, JK.j, MyTracker.AttributionListener, com.avito.android.code_check_public.c, D81.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f422295b;

    public /* synthetic */ h(int i12) {
        this.f422295b = i12;
    }

    public static int c(Class cls, Parcel parcel, LinkedHashMap linkedHashMap, String str, int i12, int i13) {
        linkedHashMap.put(str, parcel.readValue(cls.getClassLoader()));
        return i12 + i13;
    }

    public static String d(StringBuilder sb2, Float f12, char c12) {
        sb2.append(f12);
        sb2.append(c12);
        return sb2.toString();
    }

    public static String e(StringBuilder sb2, LinkedHashMap linkedHashMap, char c12) {
        sb2.append(linkedHashMap);
        sb2.append(c12);
        return sb2.toString();
    }

    public static String f(StringBuilder sb2, org.threeten.bp.g gVar, char c12) {
        sb2.append(gVar);
        sb2.append(c12);
        return sb2.toString();
    }

    public static HashMap g(String str, String str2) {
        HashMap map = new HashMap();
        map.put(str, str2);
        return map;
    }

    public static void h(Parcel parcel, String str, Map.Entry entry) {
        parcel.writeString(str);
        parcel.writeValue(entry.getValue());
    }

    public static void i(Integer num, String str, LinkedHashMap linkedHashMap) {
        linkedHashMap.put(str, Integer.valueOf(num.intValue()));
    }

    @Override // JK.j
    public Object b(Object obj) {
        switch (this.f422295b) {
            case 4:
                break;
            case 5:
                break;
            case 9:
                break;
            default:
                break;
        }
        return G0.f406611a;
    }

    @Override // com.avito.android.code_check_public.c
    public Object k0(Context context) {
        switch (this.f422295b) {
            case 13:
                return Integer.valueOf(context.getResources().getDimensionPixelSize(com.avito.android.R.dimen.code_check_code_subtitle_margin_top));
            case 14:
                return Integer.valueOf(context.getResources().getDimensionPixelSize(com.avito.android.R.dimen.tfa_enable_confirm_code_check_code_confirm_input_margin_top));
            default:
                return new AttributedText(context.getString(com.avito.android.R.string.tfa_enable_code_check_select_phone_subtitle), C42784z0.f406748b, 0);
        }
    }

    @Override // org.webrtc.EglThread.ReleaseMonitor
    public boolean onRelease(EglThread eglThread) {
        return EglThread.lambda$create$1(eglThread);
    }

    @Override // D81.b
    public void a() {
    }

    @Override // com.my.tracker.MyTracker.AttributionListener
    public void onReceiveAttribution(MyTrackerAttribution myTrackerAttribution) {
    }
}
