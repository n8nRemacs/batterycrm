package com.avito.android.photo_list_view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;

/* compiled from: ImageListAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "layoutRes", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.photo_list_view.e, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C33211e extends kotlin.jvm.internal.N implements Y41.l<Integer, View> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ LayoutInflater f218164l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f218165m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33211e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        super(1);
        this.f218164l = layoutInflater;
        this.f218165m = viewGroup;
    }

    @Override // Y41.l
    public final View invoke(Integer num) {
        return this.f218164l.inflate(num.intValue(), this.f218165m, false);
    }
}
