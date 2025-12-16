package com.avito.android.photo_list_view.re23;

import Y41.l;
import android.view.View;
import android.view.ViewGroup;
import com.akita.compose.theme.re23.style.C0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PublishPhotoListAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "layoutRes", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class g extends N implements l<Integer, View> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f218206l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ViewGroup viewGroup) {
        super(1);
        this.f218206l = viewGroup;
    }

    @Override // Y41.l
    public final View invoke(Integer num) {
        int iIntValue = num.intValue();
        ViewGroup viewGroup = this.f218206l;
        return C0.b(viewGroup, iIntValue, viewGroup, false);
    }
}
