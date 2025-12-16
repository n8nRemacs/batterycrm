package com.avito.android.comfortable_deal.deal.item.commenttabs;

import com.avito.android.R;
import com.avito.android.printable_text.PrintableText;
import java.io.Serializable;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CommentTabsItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/item/commenttabs/CommentTab;", "", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CommentTab {

    /* renamed from: c, reason: collision with root package name */
    public static final CommentTab f121308c;

    /* renamed from: d, reason: collision with root package name */
    public static final CommentTab f121309d;

    /* renamed from: e, reason: collision with root package name */
    public static final CommentTab f121310e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ CommentTab[] f121311f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f121312g;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final PrintableText f121313b;

    /* compiled from: CommentTabsItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[CommentTab.values().length];
            try {
                iArr[CommentTab.f121308c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CommentTab.f121309d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CommentTab.f121310e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        CommentTab commentTab = new CommentTab(0, com.avito.android.printable_text.b.c(R.string.comment_tab_all, new Serializable[0]), "All");
        f121308c = commentTab;
        CommentTab commentTab2 = new CommentTab(1, com.avito.android.printable_text.b.c(R.string.comment_tab_notes, new Serializable[0]), "Notes");
        f121309d = commentTab2;
        CommentTab commentTab3 = new CommentTab(2, com.avito.android.printable_text.b.c(R.string.comment_tab_history, new Serializable[0]), "History");
        f121310e = commentTab3;
        CommentTab[] commentTabArr = {commentTab, commentTab2, commentTab3};
        f121311f = commentTabArr;
        f121312g = kotlin.enums.c.a(commentTabArr);
    }

    public CommentTab(int i12, PrintableText printableText, String str) {
        this.f121313b = printableText;
    }

    public static CommentTab valueOf(String str) {
        return (CommentTab) Enum.valueOf(CommentTab.class, str);
    }

    public static CommentTab[] values() {
        return (CommentTab[]) f121311f.clone();
    }
}
