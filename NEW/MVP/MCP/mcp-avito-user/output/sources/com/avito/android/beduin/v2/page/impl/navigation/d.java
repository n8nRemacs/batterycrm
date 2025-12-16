package com.avito.android.beduin.v2.page.impl.navigation;

import Y41.l;
import com.avito.beduin.v2.engine.D;
import com.avito.beduin.v2.render.android_view.BeduinView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BeduinV2InnerScreenFragment.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000b\u0010\u0002\u001a\u00070\u0000¢\u0006\u0002\b\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LKi/b;", "LX41/o;", "it", "Lkotlin/G0;", "invoke", "(LKi/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class d extends N implements l<Ki.b, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BeduinV2InnerScreenFragment f105138l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(BeduinV2InnerScreenFragment beduinV2InnerScreenFragment) {
        super(1);
        this.f105138l = beduinV2InnerScreenFragment;
    }

    @Override // Y41.l
    public final G0 invoke(Ki.b bVar) {
        D d12 = bVar.f9632b;
        BeduinV2InnerScreenFragment beduinV2InnerScreenFragment = this.f105138l;
        beduinV2InnerScreenFragment.f105131q0 = d12;
        BeduinView beduinView = beduinV2InnerScreenFragment.f105130p0;
        if (beduinView == null) {
            beduinView = null;
        }
        beduinView.b(d12);
        return G0.f406611a;
    }
}
