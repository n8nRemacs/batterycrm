package com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content;

import android.view.ActionMode;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PlatformTextMessageContent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class s extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AttributedText f192562l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f192563m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f192564n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ActionMode.Callback f192565o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f192566p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f192567q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(AttributedText attributedText, String str, androidx.compose.ui.v vVar, ActionMode.Callback callback, boolean z12, int i12, int i13) {
        super(2);
        this.f192562l = attributedText;
        this.f192563m = str;
        this.f192564n = vVar;
        this.f192565o = callback;
        this.f192566p = z12;
        this.f192567q = i13;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(9);
        String str = this.f192563m;
        int i12 = this.f192567q;
        u.a(this.f192562l, str, this.f192565o, this.f192566p, a12, iA2, i12);
        return G0.f406611a;
    }
}
