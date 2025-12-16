package com.avito.android.shift_list.ui.list.shift_item;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ShiftBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/shift_list/ui/list/shift_item/a;", "LTV0/b;", "Lcom/avito/android/shift_list/ui/list/shift_item/c;", "Lcom/avito/android/shift_list/ui/list/shift_item/ShiftItem;", "_avito_gig_shift-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements TV0.b<c, ShiftItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h f281127a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<g> f281128b = new g.a<>(R.layout.job_shift_list_shift_item, C8370a.f281129l);

    /* compiled from: ShiftBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/shift_list/ui/list/shift_item/g;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/shift_list/ui/list/shift_item/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.shift_list.ui.list.shift_item.a$a, reason: collision with other inner class name */
    public static final class C8370a extends N implements p<ViewGroup, View, g> {

        /* renamed from: l, reason: collision with root package name */
        public static final C8370a f281129l = new C8370a();

        public C8370a() {
            super(2);
        }

        @Override // Y41.p
        public final g invoke(ViewGroup viewGroup, View view) {
            return new g(view);
        }
    }

    @Inject
    public a(@k h hVar) {
        this.f281127a = hVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f281127a;
    }

    @Override // TV0.b
    @k
    public final g.a<g> b() {
        return this.f281128b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof ShiftItem;
    }
}
