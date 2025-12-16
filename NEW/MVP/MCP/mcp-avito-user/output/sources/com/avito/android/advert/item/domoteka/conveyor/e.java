package com.avito.android.advert.item.domoteka.conveyor;

import com.avito.android.remote.DomotekaTeaserType;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsDomotekaTeaserPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/domoteka/conveyor/e;", "Lcom/avito/android/advert/item/domoteka/conveyor/p;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f75251a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdvertDetailsDomotekaTeaserItem f75252b;

    /* compiled from: AdvertDetailsDomotekaTeaserPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[DomotekaTeaserType.values().length];
            try {
                iArr[DomotekaTeaserType.TEASER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DomotekaTeaserType.STUB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public e(j jVar, AdvertDetailsDomotekaTeaserItem advertDetailsDomotekaTeaserItem) {
        this.f75251a = jVar;
        this.f75252b = advertDetailsDomotekaTeaserItem;
    }
}
