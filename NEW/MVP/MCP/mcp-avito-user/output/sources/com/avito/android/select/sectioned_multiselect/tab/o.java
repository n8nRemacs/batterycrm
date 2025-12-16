package com.avito.android.select.sectioned_multiselect.tab;

import Xp0.AbstractC17036a;
import com.avito.android.select.bottom_sheet_pagination.blueprints.PaginationState;
import kotlin.Metadata;

/* compiled from: SectionedMultiselectTabPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/select/bottom_sheet_pagination/blueprints/PaginationState;", "it", "LXp0/a;", "apply", "(Lcom/avito/android/select/bottom_sheet_pagination/blueprints/PaginationState;)LXp0/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class o<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final o<T, R> f266798b = new o<>();

    /* compiled from: SectionedMultiselectTabPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f266799a;

        static {
            int[] iArr = new int[PaginationState.values().length];
            try {
                PaginationState paginationState = PaginationState.f265329b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f266799a = iArr;
        }
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        return a.f266799a[((PaginationState) obj).ordinal()] == 1 ? AbstractC17036a.C1350a.f19075a : AbstractC17036a.b.f19076a;
    }
}
