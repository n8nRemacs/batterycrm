package com.avito.android.photo_list_view_groups.view_holders;

import android.content.res.Resources;
import android.view.View;
import com.avito.android.R;
import com.avito.android.photo_list_view.InterfaceC33208b;
import com.avito.android.photo_list_view_groups.analytics.ClickArea;
import com.avito.android.photo_list_view_groups.image_with_group_error.ImageWithGroupError;
import com.avito.android.photo_list_view_groups.image_with_group_error.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ImageErrorViewHolder.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view_groups/view_holders/d;", "Lcom/avito/android/photo_list_view_groups/view_holders/m;", "_avito_photo-list-view-groups_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d extends m {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final g80.d f218662c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ImageWithGroupError f218663d;

    /* compiled from: ImageErrorViewHolder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            d.this.f218662c.b(null, ClickArea.f218472d);
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
            d.this.f218662c.b(null, ClickArea.f218471c);
            return G0.f406611a;
        }
    }

    /* compiled from: ImageErrorViewHolder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33208b f218667m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC33208b interfaceC33208b) {
            super(0);
            this.f218667m = interfaceC33208b;
        }

        @Override // Y41.a
        public final G0 invoke() {
            d dVar = d.this;
            dVar.f218662c.b(null, ClickArea.f218473e);
            dVar.f218688b.f(this.f218667m.getF218092a());
            return G0.f406611a;
        }
    }

    /* compiled from: ImageErrorViewHolder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.photo_list_view_groups.view_holders.d$d, reason: collision with other inner class name */
    public static final class C6566d extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33208b f218669m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6566d(InterfaceC33208b interfaceC33208b) {
            super(0);
            this.f218669m = interfaceC33208b;
        }

        @Override // Y41.a
        public final G0 invoke() {
            d dVar = d.this;
            dVar.f218662c.b(null, ClickArea.f218473e);
            dVar.f218688b.o(this.f218669m.getF218092a());
            return G0.f406611a;
        }
    }

    public d(@Y61.k View view, @Y61.k com.avito.android.photo_list_view_groups.g gVar, @Y61.k g80.d dVar) {
        super(view, gVar);
        this.f218662c = dVar;
        this.f218663d = (ImageWithGroupError) view.findViewById(R.id.image);
    }

    @Override // com.avito.android.photo_list_view_groups.view_holders.m
    public final void B80(@Y61.k InterfaceC33208b interfaceC33208b) throws Resources.NotFoundException {
        if (!(interfaceC33208b.getF218094c() instanceof InterfaceC33208b.InterfaceC6540b.C6541b)) {
            throw new IllegalStateException("Image state should be ERROR, but was " + interfaceC33208b.getF218094c());
        }
        com.avito.android.photo_list_view_groups.image_with_group_error.a aVar = new com.avito.android.photo_list_view_groups.image_with_group_error.a(new a.c(interfaceC33208b.getF218093b(), new a()), new a.d(new b()), new a.b(C42745f0.U(new a.C6562a("repeat", new c(interfaceC33208b)), new a.C6562a("delete", new C6566d(interfaceC33208b)))));
        ImageWithGroupError imageWithGroupError = this.f218663d;
        imageWithGroupError.setState(aVar);
        imageWithGroupError.setOnClickListener(null);
    }

    @Override // com.avito.android.photo_list_view.InterfaceC33207a
    public final boolean isDraggable() {
        return false;
    }
}
