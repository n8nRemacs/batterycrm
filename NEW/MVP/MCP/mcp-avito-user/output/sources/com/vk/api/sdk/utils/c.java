package com.vk.api.sdk.utils;

import android.graphics.Point;
import android.os.Build;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.u0;
import okio.C44802l;

/* compiled from: DefaultUserAgent.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
final class c extends N implements Y41.a<String> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f366709l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar) {
        super(0);
        this.f366709l = dVar;
    }

    @Override // Y41.a
    public final String invoke() {
        u0 u0Var = u0.f406856a;
        Locale locale = Locale.US;
        d dVar = this.f366709l;
        dVar.getClass();
        String str = Build.VERSION.RELEASE;
        Integer numValueOf = Integer.valueOf(Build.VERSION.SDK_INT);
        String str2 = Build.CPU_ABI;
        String str3 = Build.MANUFACTURER;
        String str4 = Build.MODEL;
        String property = System.getProperty("user.language");
        Point point = dVar.f366712c;
        String str5 = String.format(locale, "%s/%s-%s (Android %s; SDK %d; %s; %s %s; %s; %dx%d)", Arrays.copyOf(new Object[]{"VKAndroidSDK", dVar.f366710a, dVar.f366711b, str, numValueOf, str2, str3, str4, property, Integer.valueOf(Math.max(point.x, point.y)), Integer.valueOf(Math.min(point.x, point.y))}, 11));
        n nVar = n.f366742a;
        int iCharCount = 0;
        while (iCharCount < str5.length()) {
            int iCodePointAt = str5.codePointAt(iCharCount);
            iCharCount += Character.charCount(iCodePointAt);
            if (32 > iCodePointAt || iCodePointAt > 126) {
                C44802l c44802l = new C44802l();
                c44802l.N(0, iCharCount, str5);
                while (iCharCount < str5.length()) {
                    int iCodePointAt2 = str5.codePointAt(iCharCount);
                    c44802l.P((32 > iCodePointAt2 || iCodePointAt2 > 126) ? 63 : iCodePointAt2);
                    iCharCount += Character.charCount(iCodePointAt2);
                }
                return c44802l.u();
            }
        }
        return str5;
    }
}
