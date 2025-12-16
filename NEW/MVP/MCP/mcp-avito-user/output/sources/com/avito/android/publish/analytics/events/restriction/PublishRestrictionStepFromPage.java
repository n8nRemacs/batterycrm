package com.avito.android.publish.analytics.events.restriction;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PublishRestrictionStepFromPage.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/analytics/events/restriction/PublishRestrictionStepFromPage;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class PublishRestrictionStepFromPage {

    /* renamed from: b, reason: collision with root package name */
    public static final PublishRestrictionStepFromPage f232233b;

    /* renamed from: c, reason: collision with root package name */
    public static final PublishRestrictionStepFromPage f232234c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ PublishRestrictionStepFromPage[] f232235d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a f232236e;

    static {
        PublishRestrictionStepFromPage publishRestrictionStepFromPage = new PublishRestrictionStepFromPage("ADD", 0);
        f232233b = publishRestrictionStepFromPage;
        PublishRestrictionStepFromPage publishRestrictionStepFromPage2 = new PublishRestrictionStepFromPage("EDIT", 1);
        f232234c = publishRestrictionStepFromPage2;
        PublishRestrictionStepFromPage[] publishRestrictionStepFromPageArr = {publishRestrictionStepFromPage, publishRestrictionStepFromPage2};
        f232235d = publishRestrictionStepFromPageArr;
        f232236e = c.a(publishRestrictionStepFromPageArr);
    }

    public PublishRestrictionStepFromPage() {
        throw null;
    }

    public static PublishRestrictionStepFromPage valueOf(String str) {
        return (PublishRestrictionStepFromPage) Enum.valueOf(PublishRestrictionStepFromPage.class, str);
    }

    public static PublishRestrictionStepFromPage[] values() {
        return (PublishRestrictionStepFromPage[]) f232235d.clone();
    }
}
