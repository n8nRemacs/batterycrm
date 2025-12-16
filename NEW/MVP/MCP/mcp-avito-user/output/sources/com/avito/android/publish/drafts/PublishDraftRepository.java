package com.avito.android.publish.drafts;

import androidx.annotation.RestrictTo;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import io.reactivex.rxjava3.internal.operators.maybe.h0;
import io.reactivex.rxjava3.internal.operators.single.U;
import kotlin.Metadata;

/* compiled from: PublishDraftRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/drafts/PublishDraftRepository;", "Lcom/avito/android/publish/drafts/D;", "DraftSyncResult", "_avito_publish-drafts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface PublishDraftRepository extends D {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PublishDraftRepository.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/drafts/PublishDraftRepository$DraftSyncResult;", "", "_avito_publish-drafts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DraftSyncResult {

        /* renamed from: b, reason: collision with root package name */
        public static final DraftSyncResult f235332b;

        /* renamed from: c, reason: collision with root package name */
        public static final DraftSyncResult f235333c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ DraftSyncResult[] f235334d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f235335e;

        static {
            DraftSyncResult draftSyncResult = new DraftSyncResult("SUCCESS", 0);
            f235332b = draftSyncResult;
            DraftSyncResult draftSyncResult2 = new DraftSyncResult("ERROR", 1);
            f235333c = draftSyncResult2;
            DraftSyncResult[] draftSyncResultArr = {draftSyncResult, draftSyncResult2};
            f235334d = draftSyncResultArr;
            f235335e = kotlin.enums.c.a(draftSyncResultArr);
        }

        public DraftSyncResult() {
            throw null;
        }

        public static DraftSyncResult valueOf(String str) {
            return (DraftSyncResult) Enum.valueOf(DraftSyncResult.class, str);
        }

        public static DraftSyncResult[] values() {
            return (DraftSyncResult[]) f235334d.clone();
        }
    }

    /* compiled from: PublishDraftRepository.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @Y61.k
    U a();

    @Y61.k
    h0 c(@Y61.k String str, @Y61.k String str2, @Y61.k CategoryParameters categoryParameters, @Y61.k String str3, boolean z12, boolean z13, @Y61.l String str4, @Y61.l Integer num, @Y61.k Navigation navigation2, @Y61.l String str5, @Y61.k LocalPublishState localPublishState, boolean z14, boolean z15);

    @Y61.k
    @RestrictTo
    io.reactivex.rxjava3.internal.operators.completable.r d();

    @Y61.k
    U e();
}
