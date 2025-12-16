package com.avito.android.publish.details.item_wrapper.video;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.error.z;
import com.avito.android.items.ItemWithState;
import com.avito.android.publish.details.C33771m1;
import com.avito.android.remote.model.VideoPreview;
import com.avito.android.util.P2;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import l41.g;

/* compiled from: VideoItemWrapper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/details/item_wrapper/video/e;", "Lcom/avito/android/publish/details/item_wrapper/e;", "Lcom/avito/android/category_parameters/ParameterElement$I;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements com.avito.android.publish.details.item_wrapper.e<ParameterElement.I> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.publish.details.item_wrapper.video.a f234792a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C33771m1 f234793b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<G0> f234794c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public String f234795d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public y f234796e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public ParameterElement.I.a f234797f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c f234798g;

    /* compiled from: VideoItemWrapper.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/remote/model/VideoPreview;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            P2 p22 = (P2) obj;
            boolean z12 = p22 instanceof P2.a;
            e eVar = e.this;
            if (z12) {
                eVar.getClass();
                String strI = z.i(((P2.a) p22).f318719a);
                if (strI == null) {
                    strI = eVar.f234793b.f234841h;
                }
                eVar.f234797f = new ParameterElement.I.a.c(strI);
                eVar.f234794c.accept(G0.f406611a);
                return;
            }
            if (!(p22 instanceof P2.b)) {
                p22.equals(P2.c.f318721a);
                return;
            }
            eVar.getClass();
            VideoPreview videoPreview = (VideoPreview) ((P2.b) p22).f318720a;
            eVar.f234797f = new ParameterElement.I.a.C3416a(videoPreview.getVideoTitle(), videoPreview.getVideo().getPreviewImage(), videoPreview.getVideo().getVideoUrl());
            eVar.f234794c.accept(G0.f406611a);
        }
    }

    @Inject
    public e(@k com.avito.android.publish.details.item_wrapper.video.a aVar, @k C33771m1 c33771m1) {
        this.f234792a = aVar;
        this.f234793b = c33771m1;
        com.jakewharton.rxrelay3.c<G0> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f234794c = cVar;
        this.f234797f = ParameterElement.I.a.b.f117334a;
        this.f234798g = cVar;
    }

    @Override // com.avito.android.publish.details.item_wrapper.e
    @k
    /* renamed from: c, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF234783e() {
        return this.f234798g;
    }

    @Override // com.avito.android.publish.details.item_wrapper.e
    public final void clear() {
        y yVar = this.f234796e;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
    }

    public final void d(@k ParameterElement.I i12) {
        ItemWithState.State state = i12.f117330k;
        String str = i12.f117329j;
        boolean z12 = state instanceof ItemWithState.State.Normal;
        if (z12 && str != null && str.length() != 0 && !L.f(str, this.f234795d)) {
            this.f234797f = ParameterElement.I.a.d.f117336a;
            y yVar = this.f234796e;
            if (yVar != null) {
                DisposableHelper.a(yVar);
            }
            this.f234796e = (y) this.f234792a.a(str).t0(new a());
        } else if ((z12 && (str == null || str.length() == 0)) || (state instanceof ItemWithState.State.Error)) {
            this.f234797f = ParameterElement.I.a.b.f117334a;
        }
        this.f234795d = str;
        if (L.f(i12.f117327h, this.f234797f)) {
            return;
        }
        this.f234794c.accept(G0.f406611a);
    }
}
