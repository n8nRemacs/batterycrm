package com.avito.android.di.module;

import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Color;
import com.avito.android.remote.model.DimmedImage;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.LinkAction;
import com.avito.android.remote.model.NameIdEntity;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.parse.adapter.ColorTypeAdapter;
import com.avito.android.remote.parse.adapter.DeepLinkTypeAdapter;
import com.avito.android.remote.parse.adapter.DimmedImageTypeAdapter;
import com.avito.android.remote.parse.adapter.ImageTypeAdapter;
import com.avito.android.remote.parse.adapter.SerpResultDisplayTypeAdapter;
import com.avito.android.remote.parse.adapter.UriTypeAdapter;
import com.avito.android.remote.parse.adapter.stream_gson.LinkActionTypeAdapter;
import com.avito.android.remote.parse.adapter.stream_gson.NameIdEntityTypeAdapter;
import com.avito.android.util.C35975x3;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CoreOptimalJsonModule_ProvideCommonTypeAdaptersFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/di/module/B3;", "Ldagger/internal/h;", "", "Lcom/avito/android/util/x3;", "LX41/o;", "a", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class B3 implements dagger.internal.h<Set<C35975x3>> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f143847b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.f f143848a;

    /* compiled from: CoreOptimalJsonModule_ProvideCommonTypeAdaptersFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/module/B3$a;", "", "<init>", "()V", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public B3(@Y61.k dagger.internal.f fVar) {
        this.f143848a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.deep_linking.x xVar = (com.avito.android.deep_linking.x) this.f143848a.get();
        f143847b.getClass();
        C30200u3 c30200u3 = C30200u3.f144612a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new C35975x3(Uri.class, new UriTypeAdapter()));
        linkedHashSet.add(new C35975x3(Color.class, new ColorTypeAdapter(null, 1, null)));
        linkedHashSet.add(new C35975x3(DeepLink.class, new DeepLinkTypeAdapter(xVar)));
        linkedHashSet.add(new C35975x3(Image.class, new ImageTypeAdapter()));
        linkedHashSet.add(new C35975x3(DimmedImage.class, new DimmedImageTypeAdapter()));
        linkedHashSet.add(new C35975x3(NameIdEntity.class, new NameIdEntityTypeAdapter()));
        linkedHashSet.add(new C35975x3(LinkAction.class, new LinkActionTypeAdapter()));
        linkedHashSet.add(new C35975x3(SerpDisplayType.class, new SerpResultDisplayTypeAdapter()));
        return linkedHashSet;
    }
}
