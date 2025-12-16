package com.avito.android.autoteka.helpers;

import com.avito.android.component.toast.f;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SharedToast.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/autoteka/helpers/l;", "", "<init>", "()V", "a", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final l f96668a = new l();

    /* compiled from: SharedToast.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/helpers/l$a;", "", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f96669a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ToastBarPosition f96670b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.component.toast.f f96671c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final PrintableText f96672d;

        public a(int i12, ToastBarPosition toastBarPosition, com.avito.android.component.toast.f fVar, PrintableText printableText, int i13, C42822w c42822w) {
            i12 = (i13 & 1) != 0 ? 10000 : i12;
            toastBarPosition = (i13 & 2) != 0 ? ToastBarPosition.f181046d : toastBarPosition;
            fVar = (i13 & 4) != 0 ? f.a.f125253a : fVar;
            this.f96669a = i12;
            this.f96670b = toastBarPosition;
            this.f96671c = fVar;
            this.f96672d = printableText;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f96669a == aVar.f96669a && this.f96670b == aVar.f96670b && L.f(this.f96671c, aVar.f96671c) && L.f(this.f96672d, aVar.f96672d);
        }

        public final int hashCode() {
            return this.f96672d.hashCode() + ((this.f96671c.hashCode() + ((this.f96670b.hashCode() + (Integer.hashCode(this.f96669a) * 31)) * 31)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AutotekaToast(duration=");
            sb2.append(this.f96669a);
            sb2.append(", position=");
            sb2.append(this.f96670b);
            sb2.append(", type=");
            sb2.append(this.f96671c);
            sb2.append(", text=");
            return AK.c.m(sb2, this.f96672d, ')');
        }
    }

    @Y61.k
    public static a a(@Y61.k ApiError apiError) {
        com.avito.android.component.toast.f fVarB;
        if (apiError instanceof ApiError.BadRequest) {
            fVarB = f.a.f125253a;
        } else {
            f.c.f125255c.getClass();
            fVarB = f.c.a.b();
        }
        return new a(0, null, fVarB, j.d(apiError), 3, null);
    }
}
