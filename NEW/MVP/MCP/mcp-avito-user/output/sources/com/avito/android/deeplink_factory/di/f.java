package com.avito.android.deeplink_factory.di;

import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.model.Color;
import com.avito.android.remote.model.DimmedImage;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.parse.adapter.AttributedTextAdapter;
import com.avito.android.remote.parse.adapter.ColorTypeAdapter;
import com.avito.android.remote.parse.adapter.DeepLinkTypeAdapter;
import com.avito.android.remote.parse.adapter.DimmedImageTypeAdapter;
import com.avito.android.remote.parse.adapter.ImageTypeAdapter;
import com.avito.android.remote.parse.adapter.ParametrizedEventTypeAdapter;
import com.avito.android.util.X5;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.w;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DeepLinkFactoryModule_ProvideTypeAdaptersFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/deeplink_factory/di/f;", "Ldagger/internal/h;", "", "Lcom/avito/android/util/X5;", "LX41/o;", "a", "_avito-discouraged_avito-network_deeplinks-parser-factory"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f implements h<Set<X5>> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f134189b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final dagger.internal.f f134190a;

    /* compiled from: DeepLinkFactoryModule_ProvideTypeAdaptersFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deeplink_factory/di/f$a;", "", "<init>", "()V", "_avito-discouraged_avito-network_deeplinks-parser-factory"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public f(@k dagger.internal.f fVar) {
        this.f134190a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarA = g.a(w.a(this.f134190a));
        f134189b.getClass();
        com.avito.android.deeplink_factory.di.a.f134166a.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new X5(Image.class, new ImageTypeAdapter()));
        linkedHashSet.add(new X5(DimmedImage.class, new DimmedImageTypeAdapter()));
        linkedHashSet.add(new X5(AttributedText.class, new AttributedTextAdapter(null, 1, null)));
        linkedHashSet.add(new X5(DeepLink.class, new DeepLinkTypeAdapter((h31.e<x>) eVarA)));
        linkedHashSet.add(new X5(Color.class, new ColorTypeAdapter(null, 1, null)));
        linkedHashSet.add(new X5(ParametrizedEvent.class, new ParametrizedEventTypeAdapter()));
        return linkedHashSet;
    }
}
