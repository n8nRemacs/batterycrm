package com.avito.android.avl_entry.impl.ui.external_item;

import androidx.camera.video.internal.audio.q;
import com.avito.android.avl_entry.impl.ui.internal_item.show_all.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;

/* compiled from: ShortVideosView.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Q;", "", "", "it", "Lkotlin/G0;", "invoke", "(Lkotlin/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class m extends N implements Y41.l<Q<? extends Integer, ? extends Boolean>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ShortVideosViewImpl f98553l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.avl_entry.impl.util.d f98554m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ShortVideosViewImpl shortVideosViewImpl, com.avito.android.avl_entry.impl.util.d dVar) {
        super(1);
        this.f98553l = shortVideosViewImpl;
        this.f98554m = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.l
    public final G0 invoke(Q<? extends Integer, ? extends Boolean> q12) {
        Q<? extends Integer, ? extends Boolean> q13 = q12;
        int iIntValue = ((Number) q13.f406619b).intValue();
        boolean zBooleanValue = ((Boolean) q13.f406620c).booleanValue();
        ShortVideosViewImpl shortVideosViewImpl = this.f98553l;
        if (shortVideosViewImpl.f98512o) {
            com.avito.android.avl_entry.impl.util.d dVar = this.f98554m;
            dVar.pause();
            if (zBooleanValue) {
                int f98620d = dVar.getF98620d();
                if (iIntValue != f98620d) {
                    a.C2957a c2957a = new a.C2957a(f98620d);
                    com.avito.konveyor.adapter.j jVar = shortVideosViewImpl.f98504g;
                    if (jVar == null) {
                        jVar = null;
                    }
                    jVar.notifyItemChanged(f98620d, c2957a);
                }
                shortVideosViewImpl.f98509l.post(new q(iIntValue, shortVideosViewImpl));
            }
        }
        return G0.f406611a;
    }
}
