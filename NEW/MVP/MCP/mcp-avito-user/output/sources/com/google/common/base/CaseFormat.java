package com.google.common.base;

import com.google.common.base.AbstractC37259e;
import java.io.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@InterfaceC37268l
@XY0.b
/* loaded from: classes6.dex */
public abstract class CaseFormat {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ CaseFormat[] f358957b = {new a("LOWER_HYPHEN", 0, new AbstractC37259e.l('-'), "-", null), new b("LOWER_UNDERSCORE", 1, new AbstractC37259e.l('_'), "_", null), new c("LOWER_CAMEL", 2, new AbstractC37259e.j('A', 'Z'), "", null), new d("UPPER_CAMEL", 3, new AbstractC37259e.j('A', 'Z'), "", null), new e("UPPER_UNDERSCORE", 4, new AbstractC37259e.l('_'), "_", null)};

    /* JADX INFO: Fake field, exist only in values array */
    CaseFormat EF16;

    public enum a extends CaseFormat {
    }

    public enum b extends CaseFormat {
    }

    public enum c extends CaseFormat {
    }

    public enum d extends CaseFormat {
    }

    public enum e extends CaseFormat {
    }

    public static final class f extends AbstractC37266j<String, String> implements Serializable {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.base.AbstractC37266j
        public final String b(String str) {
            throw null;
        }

        @Override // com.google.common.base.InterfaceC37276u
        public final boolean equals(@I41.a Object obj) {
            if (!(obj instanceof f)) {
                return false;
            }
            ((f) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "null.converterTo(null)";
        }
    }

    public CaseFormat() {
        throw null;
    }

    public CaseFormat(String str, int i12, AbstractC37259e abstractC37259e, String str2, a aVar) {
    }

    public static CaseFormat valueOf(String str) {
        return (CaseFormat) Enum.valueOf(CaseFormat.class, str);
    }

    public static CaseFormat[] values() {
        return (CaseFormat[]) f358957b.clone();
    }
}
