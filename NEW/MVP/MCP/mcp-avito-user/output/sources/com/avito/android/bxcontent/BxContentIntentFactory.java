package com.avito.android.bxcontent;

import android.content.Intent;
import com.avito.android.AnalyticParams;
import com.avito.android.bottom_navigation.ui.NavigationScreenAction;
import com.avito.android.bxcontent.model.AdvertListAdditionalTopics;
import com.avito.android.remote.model.NavigationBarStyle;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SerpSpaceType;
import com.avito.android.remote.model.search.map.Area;
import java.util.List;
import kotlin.Metadata;

/* compiled from: BxContentIntentFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/BxContentIntentFactory;", "", "a", "SerpItemType", "_avito_serp_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface BxContentIntentFactory {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BxContentIntentFactory.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/BxContentIntentFactory$SerpItemType;", "", "_avito_serp_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SerpItemType {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ SerpItemType[] f109311b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f109312c;

        static {
            SerpItemType[] serpItemTypeArr = {new SerpItemType("ADVERT", 0)};
            f109311b = serpItemTypeArr;
            f109312c = kotlin.enums.c.a(serpItemTypeArr);
        }

        public SerpItemType() {
            throw null;
        }

        public static SerpItemType valueOf(String str) {
            return (SerpItemType) Enum.valueOf(SerpItemType.class, str);
        }

        public static SerpItemType[] values() {
            return (SerpItemType[]) f109311b.clone();
        }
    }

    /* compiled from: BxContentIntentFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/BxContentIntentFactory$a;", "", "<init>", "()V", "_avito_serp_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        static {
            new a();
        }
    }

    /* compiled from: BxContentIntentFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b {
    }

    @Y61.k
    Intent a(@Y61.k String str);

    @Y61.k
    Intent b(@Y61.k SearchParams searchParams, @Y61.l String str, @Y61.l String str2, @Y61.k PresentationType presentationType, @Y61.l String str3, @Y61.k SerpSpaceType serpSpaceType, boolean z12, @Y61.l NavigationBarStyle navigationBarStyle, @Y61.l List list, @Y61.l AnalyticParams analyticParams, @Y61.l String str4, @Y61.l String str5, @Y61.l AdvertListAdditionalTopics advertListAdditionalTopics, boolean z13, @Y61.l Boolean bool, @Y61.l String str6, @Y61.l Area area, @Y61.l Area area2, @Y61.l String str7, @Y61.l Float f12, @Y61.k NavigationScreenAction navigationScreenAction);
}
