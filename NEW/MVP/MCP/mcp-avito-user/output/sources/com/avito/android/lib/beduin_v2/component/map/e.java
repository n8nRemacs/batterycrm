package com.avito.android.lib.beduin_v2.component.map;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.avito.android.R;
import com.avito.android.lib.beduin_v2.component.map.k;
import com.avito.android.util.y6;
import com.avito.beduin.v2.avito.component.map.state.Pin;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Z;
import kotlinx.coroutines.r;
import m.C43852a;
import uS.C48945c;

/* compiled from: MapPinsLoader.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/map/e;", "Lcom/bumptech/glide/request/target/e;", "Landroid/graphics/drawable/Drawable;", "_design-modules_beduin-v2_renderer_component_map"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e extends com.bumptech.glide.request.target.e<Drawable> {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f175822e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C48945c f175823f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Context f175824g;

    /* compiled from: MapPinsLoader.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[Pin.Anchor.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Pin.Anchor anchor = Pin.Anchor.f334647c;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Pin.Anchor anchor2 = Pin.Anchor.f334647c;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                Pin.Anchor anchor3 = Pin.Anchor.f334647c;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public e(r rVar, C48945c c48945c, Context context) {
        this.f175822e = rVar;
        this.f175823f = c48945c;
        this.f175824g = context;
    }

    @Override // com.bumptech.glide.request.target.q
    public final void b(@Y61.l Drawable drawable) {
        this.f175822e.f(null);
    }

    @Override // com.bumptech.glide.request.target.q
    public final void c(Object obj, com.bumptech.glide.request.transition.f fVar) {
        int i12 = Z.f406624c;
        this.f175822e.resumeWith(new k.b((Drawable) obj));
    }

    @Override // com.bumptech.glide.request.target.e, com.bumptech.glide.request.target.q
    public final void g(@Y61.l Drawable drawable) {
        k.a aVar;
        int iOrdinal = this.f175823f.f439967b.ordinal();
        Context context = this.f175824g;
        if (iOrdinal == 0) {
            aVar = new k.a(C43852a.a(context, R.drawable.default_center_anchor_pin), y6.b(16), y6.b(16));
        } else {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                aVar = new k.a(C43852a.a(context, R.drawable.default_center_anchor_pin), y6.b(16), y6.b(16));
            }
            aVar = new k.a(C43852a.a(context, R.drawable.default_bottom_center_anchor_pin), y6.b(32), y6.b(40));
        }
        int i12 = Z.f406624c;
        this.f175822e.resumeWith(aVar);
    }
}
