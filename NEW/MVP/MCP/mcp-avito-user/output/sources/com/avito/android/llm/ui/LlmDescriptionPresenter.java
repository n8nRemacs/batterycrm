package com.avito.android.llm.ui;

import Y41.l;
import Y61.k;
import com.avito.android.remote.model.category_parameters.CharParameter;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: LlmDescriptionPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/llm/ui/LlmDescriptionPresenter;", "", "Feature", "_avito_llm_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface LlmDescriptionPresenter {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LlmDescriptionPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/llm/ui/LlmDescriptionPresenter$Feature;", "", "_avito_llm_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Feature {

        /* renamed from: b, reason: collision with root package name */
        public static final Feature f181677b;

        /* renamed from: c, reason: collision with root package name */
        public static final Feature f181678c;

        /* renamed from: d, reason: collision with root package name */
        public static final Feature f181679d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ Feature[] f181680e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f181681f;

        static {
            Feature feature = new Feature("AUTO_DESCRIPTION", 0);
            f181677b = feature;
            Feature feature2 = new Feature("BEAUTIFICATION", 1);
            f181678c = feature2;
            Feature feature3 = new Feature("NONE", 2);
            f181679d = feature3;
            Feature[] featureArr = {feature, feature2, feature3};
            f181680e = featureArr;
            f181681f = kotlin.enums.c.a(featureArr);
        }

        public Feature() {
            throw null;
        }

        public static Feature valueOf(String str) {
            return (Feature) Enum.valueOf(Feature.class, str);
        }

        public static Feature[] values() {
            return (Feature[]) f181680e.clone();
        }
    }

    boolean a();

    void b(@k l<? super a, G0> lVar);

    void c();

    @k
    /* renamed from: d */
    Feature getF181688a();

    void e(@k String str);

    void f(@k d dVar);

    void g(@k String str);

    @k
    /* renamed from: h */
    String getF181689b();

    void i();

    void j(@Y61.l CharParameter.AutoDescription autoDescription, @Y61.l CharParameter.AutoBeautification autoBeautification);

    void k(@k String str);

    void l();
}
