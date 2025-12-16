package com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.link_snippet_message;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.remote.model.Image;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: LinkSnippetMessageContent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class a extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f192524l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f192525m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f192526n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Image f192527o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ v f192528p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f192529q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f192530r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, String str2, String str3, Image image, v vVar, boolean z12, int i12) {
        super(2);
        this.f192524l = str;
        this.f192525m = str2;
        this.f192526n = str3;
        this.f192527o = image;
        this.f192528p = vVar;
        this.f192529q = z12;
        this.f192530r = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f192530r | 1);
        v vVar = this.f192528p;
        String str = this.f192526n;
        Image image = this.f192527o;
        c.a(this.f192524l, this.f192525m, str, image, vVar, this.f192529q, a12, iA2);
        return G0.f406611a;
    }
}
