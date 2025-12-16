package com.yandex.div.internal;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ComparisonFailure.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/internal/c;", "Ljava/lang/AssertionError;", "Lkotlin/AssertionError;", "a", "b", "assertion_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class c extends AssertionError {

    @Deprecated
    private static final long serialVersionUID = 1;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f370041b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f370042c;

    /* compiled from: ComparisonFailure.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/yandex/div/internal/c$a;", "", "<init>", "()V", "", "MAX_CONTEXT_LENGTH", "I", "", "serialVersionUID", "J", "assertion_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ComparisonFailure.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div/internal/c$b;", "", "a", "assertion_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f370043a;

        /* renamed from: b, reason: collision with root package name */
        public int f370044b;

        /* renamed from: c, reason: collision with root package name */
        public int f370045c;

        /* compiled from: ComparisonFailure.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/yandex/div/internal/c$b$a;", "", "<init>", "()V", "", "DELTA_END", "Ljava/lang/String;", "DELTA_START", "ELLIPSIS", "assertion_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        static {
            new a(null);
        }

        public b(@Y61.l String str, @Y61.l String str2) {
            this.f370043a = str;
        }

        public final String a(String str) {
            String strC = C22026a.c(new StringBuilder("["), str.substring(this.f370044b, (str.length() - this.f370045c) + 1), ']');
            int i12 = this.f370044b;
            String str2 = this.f370043a;
            if (i12 > 0) {
                strC = L.j(strC, L.j(str2.substring(Math.max(0, i12 - 20), this.f370044b), i12 > 20 ? "..." : ""));
            }
            if (this.f370045c <= 0) {
                return strC;
            }
            return L.j(L.j((str2.length() - this.f370045c) + 1 < str2.length() - 20 ? "..." : "", str2.substring((str2.length() - this.f370045c) + 1, Math.min((str2.length() - this.f370045c) + 21, str2.length()))), strC);
        }
    }

    static {
        new a(null);
    }

    public c(@Y61.l String str, @Y61.k String str2, @Y61.k String str3) {
        super(str);
        this.f370041b = str2;
        this.f370042c = str3;
    }

    @Override // java.lang.Throwable
    @Y61.k
    public final String getMessage() {
        String str = this.f370041b;
        String str2 = this.f370042c;
        b bVar = new b(str, str2);
        String message = super.getMessage();
        if (str == null || str2 == null || str.equals(str2)) {
            return com.yandex.div.internal.a.b(str, message, str2);
        }
        bVar.f370044b = 0;
        int iMin = Math.min(str.length(), str2.length());
        while (true) {
            int i12 = bVar.f370044b;
            if (i12 >= iMin || str.charAt(i12) != str2.charAt(bVar.f370044b)) {
                break;
            }
            bVar.f370044b++;
        }
        int length = str.length() - 1;
        int length2 = str2.length() - 1;
        while (true) {
            int i13 = bVar.f370044b;
            if (length2 < i13 || length < i13 || str.charAt(length) != str2.charAt(length2)) {
                break;
            }
            length2--;
            length--;
        }
        bVar.f370045c = str.length() - length;
        return com.yandex.div.internal.a.b(bVar.a(str), message, bVar.a(str2));
    }
}
