package com.avito.android.app.task;

import com.avito.android.app.task.PublishDraftsSyncTask;
import com.avito.android.publish.drafts.PublishDraftRepository;
import kotlin.Metadata;

/* compiled from: PublishDraftsSyncTask.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/publish/drafts/PublishDraftRepository$DraftSyncResult;", "it", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.app.task.s1, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class C28593s1<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final C28593s1<T, R> f91732b = new C28593s1<>();

    /* compiled from: PublishDraftsSyncTask.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.app.task.s1$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f91733a;

        static {
            int[] iArr = new int[PublishDraftRepository.DraftSyncResult.values().length];
            try {
                PublishDraftRepository.DraftSyncResult draftSyncResult = PublishDraftRepository.DraftSyncResult.f235332b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f91733a = iArr;
        }
    }

    @Override // l41.o
    public final Object apply(Object obj) throws PublishDraftsSyncTask.a {
        PublishDraftRepository.DraftSyncResult draftSyncResult = (PublishDraftRepository.DraftSyncResult) obj;
        if (a.f91733a[draftSyncResult.ordinal()] == 1) {
            return draftSyncResult;
        }
        throw new PublishDraftsSyncTask.a();
    }
}
