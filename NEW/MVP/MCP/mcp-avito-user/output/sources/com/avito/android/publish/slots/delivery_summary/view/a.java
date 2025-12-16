package com.avito.android.publish.slots.delivery_summary.view;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DeliverySummarySnippetState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/delivery_summary/view/a;", "", "a", "b", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final C7303a f243740a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final b f243741b;

    /* compiled from: DeliverySummarySnippetState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/delivery_summary/view/a$a;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.publish.slots.delivery_summary.view.a$a, reason: collision with other inner class name */
    public static final /* data */ class C7303a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Image f243742a;

        /* JADX WARN: Multi-variable type inference failed */
        public C7303a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C7303a) && L.f(this.f243742a, ((C7303a) obj).f243742a);
        }

        public final int hashCode() {
            Image image = this.f243742a;
            if (image == null) {
                return 0;
            }
            return image.hashCode();
        }

        @k
        public final String toString() {
            return c.o(new StringBuilder("ImageState(image="), this.f243742a, ')');
        }

        public C7303a(@l Image image) {
            this.f243742a = image;
        }

        public /* synthetic */ C7303a(Image image, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : image);
        }
    }

    /* compiled from: DeliverySummarySnippetState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/delivery_summary/view/a$b;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f243743a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f243744b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f243745c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f243746d;

        public b() {
            this(null, null, null, null, 15, null);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f243743a, bVar.f243743a) && L.f(this.f243744b, bVar.f243744b) && L.f(this.f243745c, bVar.f243745c) && L.f(this.f243746d, bVar.f243746d);
        }

        public final int hashCode() {
            String str = this.f243743a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f243744b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f243745c;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f243746d;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("LabelState(price=");
            sb2.append(this.f243743a);
            sb2.append(", name=");
            sb2.append(this.f243744b);
            sb2.append(", description=");
            sb2.append(this.f243745c);
            sb2.append(", seller=");
            return C22026a.c(sb2, this.f243746d, ')');
        }

        public b(String str, String str2, String str3, String str4, int i12, C42822w c42822w) {
            str = (i12 & 1) != 0 ? null : str;
            str2 = (i12 & 2) != 0 ? null : str2;
            str3 = (i12 & 4) != 0 ? null : str3;
            str4 = (i12 & 8) != 0 ? null : str4;
            this.f243743a = str;
            this.f243744b = str2;
            this.f243745c = str3;
            this.f243746d = str4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f243740a, aVar.f243740a) && L.f(this.f243741b, aVar.f243741b);
    }

    public final int hashCode() {
        C7303a c7303a = this.f243740a;
        int iHashCode = (c7303a == null ? 0 : c7303a.hashCode()) * 31;
        b bVar = this.f243741b;
        return iHashCode + (bVar != null ? bVar.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "DeliverySummarySnippetState(imageState=" + this.f243740a + ", labelState=" + this.f243741b + ')';
    }

    public a(@l C7303a c7303a, @l b bVar) {
        this.f243740a = c7303a;
        this.f243741b = bVar;
    }

    public /* synthetic */ a(C7303a c7303a, b bVar, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : c7303a, (i12 & 2) != 0 ? null : bVar);
    }
}
