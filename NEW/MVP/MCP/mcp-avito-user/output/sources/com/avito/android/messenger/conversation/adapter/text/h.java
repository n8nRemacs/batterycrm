package com.avito.android.messenger.conversation.adapter.text;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TextMessageViewDelegate.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "view", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onLongClick"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class h implements View.OnLongClickListener {

    /* renamed from: b, reason: collision with root package name */
    public static final h f189301b = new h();

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        return ((View) view.getParent()).performLongClick();
    }
}
