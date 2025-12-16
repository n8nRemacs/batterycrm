package com.yatatsu.powerwebview.rx;

import Y61.l;
import android.graphics.Bitmap;
import b31.C25402a;
import com.yatatsu.powerwebview.c;
import com.yatatsu.powerwebview.rx.PowerWebViewStateChangeEvent;
import h41.AbstractC40770a;
import io.reactivex.rxjava3.core.G;
import kotlin.Metadata;

/* compiled from: PowerWebViewStateChangeEventObservable.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/yatatsu/powerwebview/rx/a;", "Lh41/a;", "Lcom/yatatsu/powerwebview/c;", "_common_powerwebview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class a extends AbstractC40770a implements c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ G<? super PowerWebViewStateChangeEvent> f392949c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C25402a f392950d;

    public a(G<? super PowerWebViewStateChangeEvent> g12, C25402a c25402a) {
        this.f392949c = g12;
        this.f392950d = c25402a;
    }

    @Override // com.yatatsu.powerwebview.c
    public final void e(int i12) {
        if (this.f396996b.get()) {
            return;
        }
        PowerWebViewStateChangeEvent.f392936g.getClass();
        this.f392949c.onNext(new PowerWebViewStateChangeEvent(PowerWebViewStateChangeEvent.State.f392945d, i12, null, null, 0, null));
    }

    @Override // com.yatatsu.powerwebview.c
    public final void f(@l Bitmap bitmap, @l String str) {
        if (this.f396996b.get()) {
            return;
        }
        PowerWebViewStateChangeEvent.f392936g.getClass();
        this.f392949c.onNext(new PowerWebViewStateChangeEvent(PowerWebViewStateChangeEvent.State.f392943b, 0, str, bitmap, 0, null));
    }

    @Override // com.yatatsu.powerwebview.c
    public final void k(int i12, @l String str, @l String str2) {
        if (this.f396996b.get()) {
            return;
        }
        PowerWebViewStateChangeEvent.f392936g.getClass();
        this.f392949c.onNext(new PowerWebViewStateChangeEvent(PowerWebViewStateChangeEvent.State.f392946e, 0, str2, null, i12, str));
    }

    @Override // com.yatatsu.powerwebview.c
    public final void m(@l String str) {
        if (this.f396996b.get()) {
            return;
        }
        PowerWebViewStateChangeEvent.f392936g.getClass();
        this.f392949c.onNext(new PowerWebViewStateChangeEvent(PowerWebViewStateChangeEvent.State.f392944c, 0, str, null, 0, null));
    }

    @Override // h41.AbstractC40770a
    public final void n() {
        this.f392950d.f56856b.f392925c.remove(this);
    }
}
