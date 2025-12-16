package com.avito.android.item_map.view;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.avito.android.R;
import kotlin.Metadata;
import yO.C50152a;

/* compiled from: ItemMapView.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LyO/a;", "invoke", "()LyO/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class Z extends kotlin.jvm.internal.N implements Y41.a<C50152a> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ V f173602l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(V v12) {
        super(0);
        this.f173602l = v12;
    }

    @Override // Y41.a
    public final C50152a invoke() {
        return new C50152a(LayoutInflater.from(this.f173602l.f173567b.getContext()).inflate(R.layout.pin_with_badge_view, (ViewGroup) null));
    }
}
