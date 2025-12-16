package com.avito.android.code_check_public;

import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.UserDialog;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: Navigation.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\b\u0004\u0005\u0006\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/code_check_public/a;", "", "a", "b", "Lcom/avito/android/code_check_public/a$a;", "Lcom/avito/android/code_check_public/a$a$a;", "Lcom/avito/android/code_check_public/a$a$b;", "Lcom/avito/android/code_check_public/a$a$c;", "Lcom/avito/android/code_check_public/a$a$d;", "Lcom/avito/android/code_check_public/a$b;", "Lcom/avito/android/code_check_public/a$b$a;", "Lcom/avito/android/code_check_public/a$b$b;", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface a {

    /* compiled from: Navigation.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/code_check_public/a$b;", "Lcom/avito/android/code_check_public/a;", "a", "b", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b extends a {

        /* compiled from: Navigation.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/code_check_public/a$b$a;", "Lcom/avito/android/code_check_public/a;", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.code_check_public.a$b$a, reason: collision with other inner class name */
        public static final /* data */ class C3496a implements a {

            /* renamed from: a, reason: collision with root package name */
            @l
            public final Y41.a<a> f119277a;

            /* JADX WARN: Multi-variable type inference failed */
            public C3496a() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            @Override // com.avito.android.code_check_public.a
            @l
            public final Y41.a<a> a() {
                return this.f119277a;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3496a) && L.f(this.f119277a, ((C3496a) obj).f119277a);
            }

            public final int hashCode() {
                Y41.a<a> aVar = this.f119277a;
                if (aVar == null) {
                    return 0;
                }
                return aVar.hashCode();
            }

            @Y61.k
            public final String toString() {
                return r.v(new StringBuilder("Close(sideEffect="), this.f119277a, ')');
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C3496a(@l Y41.a<? extends a> aVar) {
                this.f119277a = aVar;
            }

            public /* synthetic */ C3496a(Y41.a aVar, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? null : aVar);
            }
        }

        /* compiled from: Navigation.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/code_check_public/a$b$b;", "Lcom/avito/android/code_check_public/a;", "a", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.code_check_public.a$b$b, reason: collision with other inner class name */
        public static final /* data */ class C3497b implements a {

            /* renamed from: a, reason: collision with root package name */
            @l
            public final To.b f119278a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public final C3498a f119279b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final UserDialog f119280c;

            /* renamed from: d, reason: collision with root package name */
            @l
            public final DeepLink f119281d;

            /* renamed from: e, reason: collision with root package name */
            @l
            public final Y41.a<a> f119282e;

            /* compiled from: Navigation.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/code_check_public/a$b$b$a;", "", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.code_check_public.a$b$b$a, reason: collision with other inner class name */
            public static final /* data */ class C3498a {

                /* renamed from: a, reason: collision with root package name */
                @l
                public final PrintableText f119283a;

                /* renamed from: b, reason: collision with root package name */
                public final boolean f119284b;

                /* JADX WARN: Multi-variable type inference failed */
                public C3498a() {
                    this(null, false, 3, 0 == true ? 1 : 0);
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C3498a)) {
                        return false;
                    }
                    C3498a c3498a = (C3498a) obj;
                    return L.f(this.f119283a, c3498a.f119283a) && this.f119284b == c3498a.f119284b;
                }

                public final int hashCode() {
                    PrintableText printableText = this.f119283a;
                    return Boolean.hashCode(this.f119284b) + ((printableText == null ? 0 : printableText.hashCode()) * 31);
                }

                @Y61.k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("ToastMessage(text=");
                    sb2.append(this.f119283a);
                    sb2.append(", isError=");
                    return r.x(sb2, this.f119284b, ')');
                }

                public C3498a(@l PrintableText printableText, boolean z12) {
                    this.f119283a = printableText;
                    this.f119284b = z12;
                }

                public /* synthetic */ C3498a(PrintableText printableText, boolean z12, int i12, C42822w c42822w) {
                    this((i12 & 1) != 0 ? null : printableText, (i12 & 2) != 0 ? false : z12);
                }
            }

            public C3497b() {
                this(null, null, null, null, null, 31, null);
            }

            @Override // com.avito.android.code_check_public.a
            @l
            public final Y41.a<a> a() {
                return this.f119282e;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3497b)) {
                    return false;
                }
                C3497b c3497b = (C3497b) obj;
                return L.f(this.f119278a, c3497b.f119278a) && L.f(this.f119279b, c3497b.f119279b) && L.f(this.f119280c, c3497b.f119280c) && L.f(this.f119281d, c3497b.f119281d) && L.f(this.f119282e, c3497b.f119282e);
            }

            public final int hashCode() {
                To.b bVar = this.f119278a;
                int iHashCode = (bVar == null ? 0 : bVar.f15854a.hashCode()) * 31;
                C3498a c3498a = this.f119279b;
                int iHashCode2 = (iHashCode + (c3498a == null ? 0 : c3498a.hashCode())) * 31;
                UserDialog userDialog = this.f119280c;
                int iHashCode3 = (iHashCode2 + (userDialog == null ? 0 : userDialog.hashCode())) * 31;
                DeepLink deepLink = this.f119281d;
                int iHashCode4 = (iHashCode3 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
                Y41.a<a> aVar = this.f119282e;
                return iHashCode4 + (aVar != null ? aVar.hashCode() : 0);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Finish(packResult=");
                sb2.append(this.f119278a);
                sb2.append(", toastMessage=");
                sb2.append(this.f119279b);
                sb2.append(", userDialog=");
                sb2.append(this.f119280c);
                sb2.append(", deepLink=");
                sb2.append(this.f119281d);
                sb2.append(", sideEffect=");
                return r.v(sb2, this.f119282e, ')');
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C3497b(@l To.b bVar, @l C3498a c3498a, @l UserDialog userDialog, @l DeepLink deepLink, @l Y41.a<? extends a> aVar) {
                this.f119278a = bVar;
                this.f119279b = c3498a;
                this.f119280c = userDialog;
                this.f119281d = deepLink;
                this.f119282e = aVar;
            }

            public /* synthetic */ C3497b(To.b bVar, C3498a c3498a, UserDialog userDialog, DeepLink deepLink, Y41.a aVar, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? null : bVar, (i12 & 2) != 0 ? null : c3498a, (i12 & 4) != 0 ? null : userDialog, (i12 & 8) != 0 ? null : deepLink, (i12 & 16) != 0 ? null : aVar);
            }
        }
    }

    @l
    Y41.a<a> a();

    /* compiled from: Navigation.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/code_check_public/a$a;", "Lcom/avito/android/code_check_public/a;", "a", "b", "c", "d", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.code_check_public.a$a, reason: collision with other inner class name */
    public interface InterfaceC3494a extends a {

        /* compiled from: Navigation.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/code_check_public/a$a$a;", "Lcom/avito/android/code_check_public/a;", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.code_check_public.a$a$a, reason: collision with other inner class name */
        public static final /* data */ class C3495a implements a {

            /* renamed from: a, reason: collision with root package name */
            @l
            public final Y41.a<a> f119269a;

            /* JADX WARN: Multi-variable type inference failed */
            public C3495a() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            @Override // com.avito.android.code_check_public.a
            @l
            public final Y41.a<a> a() {
                return this.f119269a;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3495a) && L.f(this.f119269a, ((C3495a) obj).f119269a);
            }

            public final int hashCode() {
                Y41.a<a> aVar = this.f119269a;
                if (aVar == null) {
                    return 0;
                }
                return aVar.hashCode();
            }

            @Y61.k
            public final String toString() {
                return r.v(new StringBuilder("Back(sideEffect="), this.f119269a, ')');
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C3495a(@l Y41.a<? extends a> aVar) {
                this.f119269a = aVar;
            }

            public /* synthetic */ C3495a(Y41.a aVar, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? null : aVar);
            }
        }

        /* compiled from: Navigation.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/code_check_public/a$a$c;", "Lcom/avito/android/code_check_public/a;", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.code_check_public.a$a$c */
        public static final /* data */ class c implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final i f119272a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public final Y41.a<a> f119273b;

            public c() {
                throw null;
            }

            public c(i iVar, Y41.a aVar, int i12, C42822w c42822w) {
                aVar = (i12 & 2) != 0 ? null : aVar;
                this.f119272a = iVar;
                this.f119273b = aVar;
            }

            @Override // com.avito.android.code_check_public.a
            @l
            public final Y41.a<a> a() {
                return this.f119273b;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return L.f(this.f119272a, cVar.f119272a) && L.f(this.f119273b, cVar.f119273b);
            }

            public final int hashCode() {
                int iHashCode = this.f119272a.hashCode() * 31;
                Y41.a<a> aVar = this.f119273b;
                return iHashCode + (aVar == null ? 0 : aVar.hashCode());
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("OpenDialog(destination=");
                sb2.append(this.f119272a);
                sb2.append(", sideEffect=");
                return r.v(sb2, this.f119273b, ')');
            }
        }

        /* compiled from: Navigation.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/code_check_public/a$a$b;", "Lcom/avito/android/code_check_public/a;", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.code_check_public.a$a$b */
        public static final /* data */ class b implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final DeepLink f119270a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public final Y41.a<a> f119271b;

            /* JADX WARN: Multi-variable type inference failed */
            public b(@Y61.k DeepLink deepLink, @l Y41.a<? extends a> aVar) {
                this.f119270a = deepLink;
                this.f119271b = aVar;
            }

            @Override // com.avito.android.code_check_public.a
            @l
            public final Y41.a<a> a() {
                return this.f119271b;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return L.f(this.f119270a, bVar.f119270a) && L.f(this.f119271b, bVar.f119271b);
            }

            public final int hashCode() {
                int iHashCode = this.f119270a.hashCode() * 31;
                Y41.a<a> aVar = this.f119271b;
                return iHashCode + (aVar == null ? 0 : aVar.hashCode());
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("OpenDeeplink(destination=");
                sb2.append(this.f119270a);
                sb2.append(", sideEffect=");
                return r.v(sb2, this.f119271b, ')');
            }

            public /* synthetic */ b(DeepLink deepLink, Y41.a aVar, int i12, C42822w c42822w) {
                this(deepLink, (i12 & 2) != 0 ? null : aVar);
            }
        }

        /* compiled from: Navigation.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/code_check_public/a$a$d;", "Lcom/avito/android/code_check_public/a;", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.code_check_public.a$a$d */
        public static final /* data */ class d implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final com.avito.android.code_check_public.screen.h f119274a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f119275b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final Y41.a<a> f119276c;

            /* JADX WARN: Multi-variable type inference failed */
            public d(@Y61.k com.avito.android.code_check_public.screen.h hVar, boolean z12, @l Y41.a<? extends a> aVar) {
                this.f119274a = hVar;
                this.f119275b = z12;
                this.f119276c = aVar;
            }

            public static d b(d dVar, Y41.a aVar, int i12) {
                boolean z12 = (i12 & 2) != 0 ? dVar.f119275b : false;
                if ((i12 & 4) != 0) {
                    aVar = dVar.f119276c;
                }
                return new d(dVar.f119274a, z12, aVar);
            }

            @Override // com.avito.android.code_check_public.a
            @l
            public final Y41.a<a> a() {
                return this.f119276c;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return L.f(this.f119274a, dVar.f119274a) && this.f119275b == dVar.f119275b && L.f(this.f119276c, dVar.f119276c);
            }

            public final int hashCode() {
                int i12 = r.i(this.f119274a.hashCode() * 31, 31, this.f119275b);
                Y41.a<a> aVar = this.f119276c;
                return i12 + (aVar == null ? 0 : aVar.hashCode());
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("OpenScreen(destination=");
                sb2.append(this.f119274a);
                sb2.append(", addToBackStack=");
                sb2.append(this.f119275b);
                sb2.append(", sideEffect=");
                return r.v(sb2, this.f119276c, ')');
            }

            public /* synthetic */ d(com.avito.android.code_check_public.screen.h hVar, boolean z12, Y41.a aVar, int i12, C42822w c42822w) {
                this(hVar, (i12 & 2) != 0 ? true : z12, (i12 & 4) != 0 ? null : aVar);
            }
        }
    }
}
