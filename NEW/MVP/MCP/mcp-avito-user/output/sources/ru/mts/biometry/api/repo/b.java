package ru.mts.biometry.api.repo;

import Y61.k;
import android.content.Context;
import android.os.Build;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: DeviceInfoRepo.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/mts/biometry/api/repo/b;", "Lru/mts/biometry/api/repo/a;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f436358a;

    public b(boolean z12, boolean z13, @k Context context) {
        String str;
        int i12;
        String str2;
        Object objValueOf;
        StringBuilder sb2;
        CharSequence applicationLabel = context.getPackageManager().getApplicationLabel(context.getApplicationInfo());
        String str3 = "";
        String str4 = z12 ? "Emulator " : z13 ? "Rooted " : "";
        StringBuilder sb3 = new StringBuilder();
        sb3.append((Object) applicationLabel);
        sb3.append("/3.5.4 (");
        sb3.append(str4);
        sb3.append("Android ");
        sb3.append(Build.VERSION.RELEASE);
        sb3.append("; ");
        sb3.append(Build.MANUFACTURER);
        char c12 = ' ';
        sb3.append(' ');
        String strC = C22026a.c(sb3, Build.MODEL, ')');
        StringBuilder sb4 = new StringBuilder();
        int i13 = 0;
        while (i13 < strC.length()) {
            char cCharAt = strC.charAt(i13);
            if (c12 > cCharAt || cCharAt >= 127) {
                str = strC;
                i12 = i13;
                str2 = str3;
                objValueOf = P0.g(new Q((char) 1040, "A"), new Q((char) 1041, "B"), new Q((char) 1042, "V"), new Q((char) 1043, "G"), new Q((char) 1044, "D"), new Q((char) 1045, "E"), new Q((char) 1025, "Yo"), new Q((char) 1046, "Zh"), new Q((char) 1047, "Z"), new Q((char) 1048, "I"), new Q((char) 1049, "Y"), new Q((char) 1050, "K"), new Q((char) 1051, "L"), new Q((char) 1052, "M"), new Q((char) 1053, "N"), new Q((char) 1054, "O"), new Q((char) 1055, "P"), new Q((char) 1056, "R"), new Q((char) 1057, "S"), new Q((char) 1058, "T"), new Q((char) 1059, "U"), new Q((char) 1060, "F"), new Q((char) 1061, "Kh"), new Q((char) 1062, "Ts"), new Q((char) 1063, "Ch"), new Q((char) 1064, "Sh"), new Q((char) 1065, "Shch"), new Q((char) 1066, str3), new Q((char) 1067, "Y"), new Q((char) 1068, str3), new Q((char) 1069, "E"), new Q((char) 1070, "Yu"), new Q((char) 1071, "Ya"), new Q((char) 1072, "a"), new Q((char) 1073, "b"), new Q((char) 1074, "v"), new Q((char) 1075, "g"), new Q((char) 1076, "d"), new Q((char) 1077, "e"), new Q((char) 1105, "yo"), new Q((char) 1078, "zh"), new Q((char) 1079, "z"), new Q((char) 1080, "i"), new Q((char) 1081, "y"), new Q((char) 1082, "k"), new Q((char) 1083, "l"), new Q((char) 1084, "m"), new Q((char) 1085, "n"), new Q((char) 1086, "o"), new Q((char) 1087, "p"), new Q((char) 1088, "r"), new Q((char) 1089, "s"), new Q((char) 1090, "t"), new Q((char) 1091, "u"), new Q((char) 1092, "f"), new Q((char) 1093, "kh"), new Q((char) 1094, "ts"), new Q((char) 1095, "ch"), new Q((char) 1096, "sh"), new Q((char) 1097, "shch"), new Q((char) 1098, str3), new Q((char) 1099, "y"), new Q((char) 1100, str3), new Q((char) 1101, "e"), new Q((char) 1102, "yu"), new Q((char) 1103, "ya")).get(Character.valueOf(cCharAt));
                sb2 = sb4;
                if (objValueOf == null) {
                    objValueOf = str2;
                }
            } else {
                objValueOf = Character.valueOf(cCharAt);
                str2 = str3;
                str = strC;
                sb2 = sb4;
                i12 = i13;
            }
            sb2.append(objValueOf);
            i13 = i12 + 1;
            strC = str;
            sb4 = sb2;
            str3 = str2;
            c12 = ' ';
        }
        this.f436358a = sb4.toString();
    }

    @Override // ru.mts.biometry.api.repo.a
    @k
    /* renamed from: getInfo, reason: from getter */
    public final String getF436358a() {
        return this.f436358a;
    }
}
