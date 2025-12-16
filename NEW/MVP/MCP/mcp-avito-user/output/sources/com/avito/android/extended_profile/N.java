package com.avito.android.extended_profile;

import androidx.recyclerview.widget.RecyclerView;
import com.avito.beduin.v2.render.android_view.BeduinView;
import kotlin.Metadata;

/* compiled from: ExtendedProfileMviView.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/recyclerview/widget/RecyclerView;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class N extends kotlin.jvm.internal.N implements Y41.a<RecyclerView> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ A f149346l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(A a12) {
        super(0);
        this.f149346l = a12;
    }

    @Override // Y41.a
    public final RecyclerView invoke() {
        BeduinView beduinView = this.f149346l.f149216A;
        if (beduinView != null) {
            return CA.b.a(beduinView);
        }
        return null;
    }
}
