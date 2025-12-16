package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.serialization.InterfaceC43387f;

/* compiled from: JsonNamingStrategy.kt */
@InterfaceC43387f
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bç\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/serialization/json/z;", "", "a", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface z {

    /* compiled from: JsonNamingStrategy.kt */
    @InterfaceC43387f
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/serialization/json/z$a;", "", "<init>", "()V", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f413147a = new a();

        /* compiled from: JsonNamingStrategy.kt */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"kotlinx/serialization/json/z$a$a", "Lkotlinx/serialization/json/z;", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: kotlinx.serialization.json.z$a$a, reason: collision with other inner class name */
        public static final class C11758a implements z {
            @Override // kotlinx.serialization.json.z
            @Y61.k
            public final String a(@Y61.k String str) {
                return a.a(a.f413147a, str, '-');
            }

            @Y61.k
            public final String toString() {
                return "kotlinx.serialization.json.JsonNamingStrategy.KebabCase";
            }
        }

        /* compiled from: JsonNamingStrategy.kt */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"kotlinx/serialization/json/z$a$b", "Lkotlinx/serialization/json/z;", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b implements z {
            @Override // kotlinx.serialization.json.z
            @Y61.k
            public final String a(@Y61.k String str) {
                return a.a(a.f413147a, str, '_');
            }

            @Y61.k
            public final String toString() {
                return "kotlinx.serialization.json.JsonNamingStrategy.SnakeCase";
            }
        }

        static {
            new b();
            new C11758a();
        }

        public static final String a(a aVar, String str, char c12) {
            aVar.getClass();
            StringBuilder sb2 = new StringBuilder(str.length() * 2);
            Character chValueOf = null;
            int i12 = 0;
            for (int i13 = 0; i13 < str.length(); i13++) {
                char cCharAt = str.charAt(i13);
                if (Character.isUpperCase(cCharAt)) {
                    if (i12 == 0 && sb2.length() > 0 && C43066x.L(sb2) != c12) {
                        sb2.append(c12);
                    }
                    if (chValueOf != null) {
                        sb2.append(chValueOf.charValue());
                    }
                    i12++;
                    chValueOf = Character.valueOf(Character.toLowerCase(cCharAt));
                } else {
                    if (chValueOf != null) {
                        if (i12 > 1 && Character.isLetter(cCharAt)) {
                            sb2.append(c12);
                        }
                        sb2.append(chValueOf);
                        chValueOf = null;
                        i12 = 0;
                    }
                    sb2.append(cCharAt);
                }
            }
            if (chValueOf != null) {
                sb2.append(chValueOf);
            }
            return sb2.toString();
        }
    }

    @Y61.k
    String a(@Y61.k String str);
}
