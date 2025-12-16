package ET0;

import com.avito.beduin.v2.logger.LogLevel;
import j.InterfaceC42156l;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43044a;
import kotlin.text.C43066x;

/* compiled from: RGBAUtils.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LET0/f;", "", "<init>", "()V", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final f f4020a = new f();

    @Y61.l
    @InterfaceC42156l
    public static Integer a(@Y61.k String str) {
        int i12;
        int i13;
        int i14;
        int i15;
        if (C43066x.K(str)) {
            RU0.b bVar = RU0.b.f14467a;
            LogLevel[] logLevelArr = LogLevel.f337864b;
            bVar.getClass();
            if (3 >= RU0.b.f14469c) {
                RU0.b.f14468b.e(RU0.b.f14470d + ":RGBAUtils", "Unknown color - value is empty");
            }
            return null;
        }
        int i16 = str.charAt(0) == '#' ? 1 : 0;
        int length = str.length() - i16;
        if (length == 3 || length == 4) {
            int i17 = 1 + i16;
            String strSubstring = str.substring(i16, i17);
            C43044a.a(16);
            int i18 = Integer.parseInt(strSubstring, 16);
            int i19 = i16 + 2;
            String strSubstring2 = str.substring(i17, i19);
            C43044a.a(16);
            int i22 = Integer.parseInt(strSubstring2, 16);
            int i23 = 3 + i16;
            String strSubstring3 = str.substring(i19, i23);
            C43044a.a(16);
            int i24 = Integer.parseInt(strSubstring3, 16);
            if (length == 4) {
                String strSubstring4 = str.substring(i23, i16 + 4);
                C43044a.a(16);
                int i25 = Integer.parseInt(strSubstring4, 16);
                i12 = i22 | (i22 << 4);
                i13 = (i24 << 4) | i24;
                i14 = ((i25 | (i25 << 4)) << 24) | (((i18 << 4) | i18) << 16);
            } else {
                i12 = i22 | (i22 << 4);
                i13 = (i24 << 4) | i24;
                i14 = (((i18 << 4) | i18) << 16) | (-16777216);
            }
            return Integer.valueOf(i14 | (i12 << 8) | i13);
        }
        if (length != 6 && length != 8) {
            RU0.b bVar2 = RU0.b.f14467a;
            LogLevel[] logLevelArr2 = LogLevel.f337864b;
            bVar2.getClass();
            if (3 < RU0.b.f14469c) {
                return null;
            }
            RU0.b.f14468b.e(AK.c.s(new StringBuilder(), RU0.b.f14470d, ":RGBAUtils"), "Unknown color \"" + str + '\"');
            return null;
        }
        int i26 = i16 + 2;
        String strSubstring5 = str.substring(i16, i26);
        C43044a.a(16);
        int i27 = Integer.parseInt(strSubstring5, 16);
        int i28 = 4 + i16;
        String strSubstring6 = str.substring(i26, i28);
        C43044a.a(16);
        int i29 = Integer.parseInt(strSubstring6, 16);
        int i32 = i16 + 6;
        String strSubstring7 = str.substring(i28, i32);
        C43044a.a(16);
        int i33 = Integer.parseInt(strSubstring7, 16);
        if (length == 8) {
            String strSubstring8 = str.substring(i32);
            C43044a.a(16);
            i15 = (Integer.parseInt(strSubstring8, 16) << 24) | (i27 << 16);
        } else {
            i15 = (i27 << 16) | (-16777216);
        }
        return Integer.valueOf(i15 | (i29 << 8) | i33);
    }
}
