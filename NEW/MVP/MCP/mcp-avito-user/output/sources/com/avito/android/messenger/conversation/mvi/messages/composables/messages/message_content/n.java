package com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import com.avito.android.remote.model.Image;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ItemMessageContent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class n extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f192544l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f192545m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f192546n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f192547o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Image f192548p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f192549q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f192550r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f192551s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, String str2, String str3, String str4, Image image, androidx.compose.ui.v vVar, boolean z12, int i12) {
        super(2);
        this.f192544l = str;
        this.f192545m = str2;
        this.f192546n = str3;
        this.f192547o = str4;
        this.f192548p = image;
        this.f192549q = vVar;
        this.f192550r = z12;
        this.f192551s = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f192551s | 1);
        androidx.compose.ui.v vVar = this.f192549q;
        String str = this.f192547o;
        Image image = this.f192548p;
        p.a(this.f192544l, this.f192545m, this.f192546n, str, image, vVar, this.f192550r, a12, iA2);
        return G0.f406611a;
    }
}
