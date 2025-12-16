package com.avito.android.search_ux_feedback.remote;

import Y61.k;
import com.avito.android.delayed_ux_feedback.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SearchRemoteFeedbackEvent.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/search_ux_feedback/remote/SearchRemoteFeedbackEvent;", "", "Lcom/avito/android/delayed_ux_feedback/c;", "a", "_avito_search-ux-feedback_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SearchRemoteFeedbackEvent implements c {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f264410c;

    /* renamed from: d, reason: collision with root package name */
    public static final SearchRemoteFeedbackEvent f264411d;

    /* renamed from: e, reason: collision with root package name */
    public static final SearchRemoteFeedbackEvent f264412e;

    /* renamed from: f, reason: collision with root package name */
    public static final SearchRemoteFeedbackEvent f264413f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ SearchRemoteFeedbackEvent[] f264414g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f264415h;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f264416b;

    /* compiled from: SearchRemoteFeedbackEvent.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/search_ux_feedback/remote/SearchRemoteFeedbackEvent$a;", "", "<init>", "()V", "", "FROM_PAGE_MAIN_QUERY", "Ljava/lang/String;", "FROM_PAGE_MAIN_SHORTCUT", "FROM_PAGE_MAIN_SUGGEST", "_avito_search-ux-feedback_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        SearchRemoteFeedbackEvent searchRemoteFeedbackEvent = new SearchRemoteFeedbackEvent("QUERY", 0, "QuerySearch");
        f264411d = searchRemoteFeedbackEvent;
        SearchRemoteFeedbackEvent searchRemoteFeedbackEvent2 = new SearchRemoteFeedbackEvent("HINT", 1, "HintSearch");
        f264412e = searchRemoteFeedbackEvent2;
        SearchRemoteFeedbackEvent searchRemoteFeedbackEvent3 = new SearchRemoteFeedbackEvent("SHORTCUT", 2, "ShortcutSearch");
        f264413f = searchRemoteFeedbackEvent3;
        SearchRemoteFeedbackEvent[] searchRemoteFeedbackEventArr = {searchRemoteFeedbackEvent, searchRemoteFeedbackEvent2, searchRemoteFeedbackEvent3};
        f264414g = searchRemoteFeedbackEventArr;
        f264415h = kotlin.enums.c.a(searchRemoteFeedbackEventArr);
        f264410c = new a(null);
    }

    public SearchRemoteFeedbackEvent(String str, int i12, String str2) {
        this.f264416b = str2;
    }

    public static SearchRemoteFeedbackEvent valueOf(String str) {
        return (SearchRemoteFeedbackEvent) Enum.valueOf(SearchRemoteFeedbackEvent.class, str);
    }

    public static SearchRemoteFeedbackEvent[] values() {
        return (SearchRemoteFeedbackEvent[]) f264414g.clone();
    }

    @Override // com.avito.android.delayed_ux_feedback.c
    @k
    /* renamed from: a, reason: from getter */
    public final String getF264416b() {
        return this.f264416b;
    }
}
