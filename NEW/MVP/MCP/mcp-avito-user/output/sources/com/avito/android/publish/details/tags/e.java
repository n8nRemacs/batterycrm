package com.avito.android.publish.details.tags;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.component.accordion.s;
import com.avito.android.ui.widget.tagged_input.m;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.internal.operators.mixed.x;
import java.util.List;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.L;
import l41.o;

/* compiled from: PublishTagsViewModel.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/details/tags/e;", "Lcom/avito/android/ui/widget/tagged_input/m;", "Lcom/avito/android/publish/details/tags/g;", "d", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public class e extends m implements g {

    /* renamed from: J, reason: collision with root package name */
    @k
    public final com.avito.android.publish.details.tags.a f235022J;

    /* renamed from: K, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f235023K;

    /* renamed from: L, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<d> f235024L;

    /* compiled from: PublishTagsViewModel.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00040\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/avito/android/publish/details/tags/e$d;", "kotlin.jvm.PlatformType", "request", "Lio/reactivex/rxjava3/core/O;", "Lkotlin/Q;", "", "", "Lcom/avito/android/ui/widget/tagged_input/TagItem;", "apply", "(Lcom/avito/android/publish/details/tags/e$d;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T, R> implements o {
        public a() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            d dVar = (d) obj;
            return e.this.f235022J.a(dVar.f235030c, dVar.f235029b).r(new com.avito.android.publish.details.tags.d(dVar));
        }
    }

    /* compiled from: PublishTagsViewModel.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Q;", "", "", "Lcom/avito/android/ui/widget/tagged_input/TagItem;", "<name for destructuring parameter 0>", "Lkotlin/G0;", "accept", "(Lkotlin/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // l41.g
        public final void accept(Object obj) {
            Q q12 = (Q) obj;
            e.this.m3((String) q12.f406619b, (List) q12.f406620c);
        }
    }

    /* compiled from: PublishTagsViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final c<T> f235027b = new c<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("PublishTagsViewModel", "Error on loading suggests", (Throwable) obj);
        }
    }

    /* compiled from: PublishTagsViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/details/tags/e$d;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f235028a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f235029b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Integer f235030c;

        public d(@k String str, @k String str2, @l Integer num) {
            this.f235028a = str;
            this.f235029b = str2;
            this.f235030c = num;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f235028a, dVar.f235028a) && L.f(this.f235029b, dVar.f235029b) && L.f(this.f235030c, dVar.f235030c);
        }

        public final int hashCode() {
            int iD2 = H.d(this.f235028a.hashCode() * 31, 31, this.f235029b);
            Integer num = this.f235030c;
            return iD2 + (num == null ? 0 : num.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Request(itemId=");
            sb2.append(this.f235028a);
            sb2.append(", query=");
            sb2.append(this.f235029b);
            sb2.append(", categoryId=");
            return s.j(sb2, this.f235030c, ')');
        }
    }

    public e(@k com.avito.android.publish.details.tags.a aVar, @k InterfaceC35745a5 interfaceC35745a5) {
        this.f235022J = aVar;
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        this.f235023K = cVar;
        com.jakewharton.rxrelay3.c<d> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f235024L = cVar2;
        cVar.b(new x(cVar2.D(io.reactivex.rxjava3.internal.functions.a.f401991a), new a()).j0(interfaceC35745a5.e()).v0(new b(), c.f235027b, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        this.f235023K.dispose();
        super.onCleared();
    }

    @Override // com.avito.android.publish.details.tags.g
    public final void t8(@l Integer num, @k String str, @k String str2) {
        this.f235024L.accept(new d(str, str2, num));
    }
}
