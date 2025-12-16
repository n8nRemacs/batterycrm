package com.avito.android.beduin.common.component.video;

import Y61.k;
import android.net.Uri;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.beduin.common.component.e;
import com.avito.android.beduin.common.component.video.BeduinVideoScaleType;
import com.avito.android.beduin.common.component.video.VideoChange;
import com.avito.android.beduin.common.component.video.f;
import com.avito.android.beduin.common.component.video.g;
import com.avito.android.beduin.common.utils.J;
import com.avito.android.beduin_models.BeduinModel;
import com.google.android.exoplayer2.source.C36548k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinVideoComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/video/a;", "Lcom/avito/android/beduin/common/component/h;", "Lcom/avito/android/beduin/common/component/video/BeduinVideoModel;", "Lcom/avito/android/beduin/common/component/video/f;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends com.avito.android.beduin.common.component.h<BeduinVideoModel, f> {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final BeduinVideoModel f102888e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final C36548k f102889f;

    /* compiled from: BeduinVideoComponent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/video/a$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.video.a$a, reason: collision with other inner class name */
    public static final class C3086a implements com.avito.android.beduin.common.component.b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C3086a f102890a = new C3086a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final List<String> f102891b = Collections.singletonList("videoPreview");

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final Class<BeduinVideoModel> f102892c = BeduinVideoModel.class;

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final Class<BeduinVideoModel> S() {
            return f102892c;
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final List<String> a() {
            return f102891b;
        }
    }

    public a(@k BeduinVideoModel beduinVideoModel, @k C36548k c36548k) {
        this.f102888e = beduinVideoModel;
        this.f102889f = c36548k;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f102888e;
    }

    @Override // ej.AbstractC40112a
    public final Object l(BeduinModel beduinModel) {
        BeduinVideoModel beduinVideoModel = (BeduinVideoModel) beduinModel;
        com.avito.android.beduin.common.component.e eVar = com.avito.android.beduin.common.component.e.f101116a;
        VideoChange[] videoChangeArrValues = VideoChange.values();
        if (videoChangeArrValues.length == 0) {
            throw new IllegalStateException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, VideoChange.class, new StringBuilder("Changes enum must have values! ")).toString());
        }
        com.avito.android.beduin.common.component.f fVar = new com.avito.android.beduin.common.component.f(C42756l.C(videoChangeArrValues));
        BeduinVideoModel beduinVideoModel2 = this.f102888e;
        if (!L.f(fVar.invoke(beduinVideoModel2), fVar.invoke(beduinVideoModel))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (VideoChange videoChange : videoChangeArrValues) {
            ((VideoChange.a) videoChange.f102886b).getClass();
            BeduinVideoState state = beduinVideoModel2.getState();
            ((VideoChange.a) videoChange.f102886b).getClass();
            if (!L.f(state, beduinVideoModel.getState())) {
                arrayList.add(videoChange);
            }
        }
        return new e.b(C42745f0.P0(arrayList));
    }

    @Override // com.avito.android.beduin.common.component.h
    public final View p(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        f fVar = new f(new ContextThemeWrapper(viewGroup.getContext(), R.style.Theme_DesignSystem_Re23), null, 0, 6, null);
        fVar.setLayoutParams(layoutParams);
        return fVar;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void q(View view) {
        f fVar = (f) view;
        BeduinVideoModel beduinVideoModel = this.f102888e;
        fVar.setTag(beduinVideoModel.getF100853b());
        J.b(fVar, beduinVideoModel.getMargin());
        fVar.setSourceFactory(this.f102889f);
        String url = beduinVideoModel.getUrl();
        boolean zIsInfinite = beduinVideoModel.isInfinite();
        boolean zIsMuted = beduinVideoModel.isMuted();
        fVar.f102905h = zIsInfinite ? 1 : 0;
        fVar.f102906i = zIsMuted ? 0.0f : 1.0f;
        fVar.f102904g = Uri.parse(url);
        g.d dVar = g.d.f102923a;
        f.a aVar = fVar.f102910m;
        aVar.q(dVar);
        fVar.setRatio(beduinVideoModel.getRatio());
        fVar.setCornerRadius(Integer.valueOf(beduinVideoModel.getCornerRadius()));
        BeduinVideoScaleType scale = beduinVideoModel.getScale();
        scale.getClass();
        int i12 = BeduinVideoScaleType.a.f102878a[scale.ordinal()];
        int i13 = 3;
        if (i12 != 1) {
            if (i12 == 2) {
                i13 = 4;
            } else {
                if (i12 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i13 = 0;
            }
        }
        fVar.setResizeMode(i13);
        aVar.setUseController(false);
        fVar.setPendingPlayingState(beduinVideoModel.getState());
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void r(View view, List list) {
        com.avito.android.beduin.common.component.e eVar = com.avito.android.beduin.common.component.e.f101116a;
        b bVar = new b((f) view, this);
        eVar.getClass();
        com.avito.android.beduin.common.component.e.a(bVar, list);
    }
}
