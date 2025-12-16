package com.avito.android.photo_list_view.re23.viewholders;

import android.content.res.Resources;
import android.view.View;
import com.avito.android.R;
import com.avito.android.photo_list_view.InterfaceC33208b;
import com.avito.android.photo_list_view.re23.image.error.PublishImageError;
import com.avito.android.photo_list_view.re23.image.error.a;
import com.avito.android.photo_list_view_groups.analytics.ClickArea;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ImageErrorViewHolder.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view/re23/viewholders/f;", "Lcom/avito/android/photo_list_view/re23/viewholders/a;", "_avito_photo-list-view_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f extends com.avito.android.photo_list_view.re23.viewholders.a {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final g80.d f218300c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final PublishImageError f218301d;

    /* compiled from: ImageErrorViewHolder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            f.this.f218300c.b(null, ClickArea.f218472d);
            return G0.f406611a;
        }
    }

    /* compiled from: ImageErrorViewHolder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            f.this.f218300c.b(null, ClickArea.f218471c);
            return G0.f406611a;
        }
    }

    /* compiled from: ImageErrorViewHolder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33208b f218305m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC33208b interfaceC33208b) {
            super(0);
            this.f218305m = interfaceC33208b;
        }

        @Override // Y41.a
        public final G0 invoke() {
            f fVar = f.this;
            fVar.f218300c.b(null, ClickArea.f218473e);
            fVar.f218279b.f(this.f218305m.getF218092a());
            return G0.f406611a;
        }
    }

    /* compiled from: ImageErrorViewHolder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33208b f218307m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC33208b interfaceC33208b) {
            super(0);
            this.f218307m = interfaceC33208b;
        }

        @Override // Y41.a
        public final G0 invoke() {
            f fVar = f.this;
            fVar.f218300c.b(null, ClickArea.f218473e);
            fVar.f218279b.o(this.f218307m.getF218092a());
            return G0.f406611a;
        }
    }

    public f(@Y61.k View view, @Y61.k com.avito.android.photo_list_view.re23.a aVar, @Y61.k g80.d dVar) {
        super(view, aVar);
        this.f218300c = dVar;
        this.f218301d = (PublishImageError) view.findViewById(R.id.image);
    }

    @Override // com.avito.android.photo_list_view.re23.viewholders.a
    public final void B80(@Y61.k InterfaceC33208b interfaceC33208b) throws Resources.NotFoundException {
        if (!(interfaceC33208b.getF218094c() instanceof InterfaceC33208b.InterfaceC6540b.C6541b)) {
            throw new IllegalStateException("Image state should be ERROR, but was " + interfaceC33208b.getF218094c());
        }
        com.avito.android.photo_list_view.re23.image.error.a aVar = new com.avito.android.photo_list_view.re23.image.error.a(new a.c(interfaceC33208b.getF218093b(), new a()), new a.d(new b()), new a.b(C42745f0.U(new a.C6548a("repeat", new c(interfaceC33208b)), new a.C6548a("delete", new d(interfaceC33208b)))));
        PublishImageError publishImageError = this.f218301d;
        publishImageError.setState(aVar);
        publishImageError.setOnClickListener(null);
    }

    @Override // com.avito.android.photo_list_view.InterfaceC33207a
    public final boolean isDraggable() {
        return false;
    }
}
