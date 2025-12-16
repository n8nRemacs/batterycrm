package com.avito.android.travel_search.domain;

import com.avito.android.travel_search.generated.api.api_1_travel_search_favorites_header_post.Widget;
import com.google.gson.Gson;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TravelSearchHeaderModelMapper.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/travel_search/domain/d;", "Lcom/avito/android/travel_search/domain/c;", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Gson f303100a;

    /* compiled from: TravelSearchHeaderModelMapper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f303101a;

        static {
            int[] iArr = new int[Widget.Type.values().length];
            try {
                iArr[Widget.Type.FormattedDate.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Widget.Type.GuestsSelect.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Widget.Type.RadioSelect.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Widget.Type.Group.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f303101a = iArr;
        }
    }

    @Inject
    public d(@Y61.k Gson gson) {
        this.f303100a = gson;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d1  */
    @Override // com.avito.android.travel_search.domain.c
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.remote.model.search.InlineFilters a(@Y61.k tF0.C48548a r80) throws java.text.ParseException {
        /*
            Method dump skipped, instructions count: 1030
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.travel_search.domain.d.a(tF0.a):com.avito.android.remote.model.search.InlineFilters");
    }
}
