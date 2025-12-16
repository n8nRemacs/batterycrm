package com.avito.android.di.module;

import com.avito.android.remote.model.SerpElement;
import com.avito.android.remote.model.category_parameters.SectionedMultiselectParameter;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.remote.model.section.SectionTypeElement;
import com.avito.android.remote.model.section.complementary_v3.SectionTypeElementV3;
import com.avito.android.remote.parse.SectionedMultiselectValueDeserializer;
import com.avito.android.remote.parse.adapter.RecommendationTypeAdapter;
import com.avito.android.remote.parse.adapter.SectionTypeElementV3Deserializer;
import com.avito.android.remote.parse.adapter.SerpElementTypeAdapter;
import com.avito.android.remote.parse.adapter.inline_filters.InlineFilterMultiSelectValueTypeAdapter;
import com.avito.android.remote.parse.adapter.inline_filters.InlineFilterSectionedMultiselectValueTypeAdapter;
import com.avito.android.remote.parse.adapter.inline_filters.InlineFilterSelectValueTypeAdapter;
import com.avito.android.remote.parse.adapter.inline_filters.InlineFilterShortcutValueDeserializer;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SearchJsonModule_ProvideTypeAdaptersFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/di/module/z7;", "Ldagger/internal/h;", "", "Lcom/avito/android/util/X5;", "LX41/o;", "a", "_avito-discouraged_avito-api_search"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.di.module.z7, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30259z7 implements dagger.internal.h<Set<com.avito.android.util.X5>> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f144741b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f144742a;

    /* compiled from: SearchJsonModule_ProvideTypeAdaptersFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/module/z7$a;", "", "<init>", "()V", "_avito-discouraged_avito-api_search"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.di.module.z7$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C30259z7(@Y61.k dagger.internal.u uVar) {
        this.f144742a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        SerpElementTypeAdapter serpElementTypeAdapter = (SerpElementTypeAdapter) this.f144742a.get();
        f144741b.getClass();
        int i12 = C30226w7.f144694a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new com.avito.android.util.X5(SerpElement.class, serpElementTypeAdapter));
        linkedHashSet.add(new com.avito.android.util.X5(SectionTypeElement.class, new RecommendationTypeAdapter()));
        linkedHashSet.add(new com.avito.android.util.X5(SectionTypeElementV3.class, new SectionTypeElementV3Deserializer()));
        linkedHashSet.add(new com.avito.android.util.X5(InlineFilterValue.InlineFilterSelectValue.class, new InlineFilterSelectValueTypeAdapter()));
        linkedHashSet.add(new com.avito.android.util.X5(InlineFilterValue.InlineFilterMultiSelectValue.class, new InlineFilterMultiSelectValueTypeAdapter()));
        linkedHashSet.add(new com.avito.android.util.X5(InlineFilterValue.InlineFilterSectionedMultiSelectValue.class, new InlineFilterSectionedMultiselectValueTypeAdapter()));
        linkedHashSet.add(new com.avito.android.util.X5(SectionedMultiselectParameter.SectionedMultiselectValue.class, new SectionedMultiselectValueDeserializer()));
        linkedHashSet.add(new com.avito.android.util.X5(InlineFilterValue.InlineFilterShortcutValue.class, new InlineFilterShortcutValueDeserializer()));
        return linkedHashSet;
    }
}
