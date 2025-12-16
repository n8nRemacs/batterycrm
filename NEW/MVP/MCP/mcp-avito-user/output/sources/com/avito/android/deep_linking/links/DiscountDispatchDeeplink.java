package com.avito.android.deep_linking.links;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DiscountDispatchLink.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/DiscountDispatchDeeplink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "Lcom/avito/android/deep_linking/links/DiscountDispatchLink;", "Lcom/avito/android/deep_linking/links/DiscountDispatchLinkLegacy;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class DiscountDispatchDeeplink extends DeepLink {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f133273b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f133274c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f133275d;

    /* compiled from: DiscountDispatchLink.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/deep_linking/links/DiscountDispatchDeeplink$a;", "", "<init>", "()V", "", "ONBOARDING_SELLERS_CARD_ENTRY_POINT", "Ljava/lang/String;", "UNKNOWN_ENTRY_POINT", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public DiscountDispatchDeeplink(String str, String str2, String str3, C42822w c42822w) {
        this.f133273b = str;
        this.f133274c = str2;
        this.f133275d = str3;
    }

    @Y61.l
    /* renamed from: f, reason: from getter */
    public String getF133274c() {
        return this.f133274c;
    }

    @Y61.l
    /* renamed from: g, reason: from getter */
    public String getF133275d() {
        return this.f133275d;
    }

    @Y61.k
    /* renamed from: getItemId, reason: from getter */
    public String getF133273b() {
        return this.f133273b;
    }
}
