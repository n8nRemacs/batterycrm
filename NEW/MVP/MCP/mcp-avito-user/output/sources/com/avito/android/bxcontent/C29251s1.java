package com.avito.android.bxcontent;

import android.content.Context;
import android.content.res.ColorStateList;
import com.avito.android.R;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalColorKt;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;
import sK0.C48063a;

/* compiled from: BxContentView.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/content/res/ColorStateList;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.bxcontent.s1, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29251s1 extends kotlin.jvm.internal.N implements Y41.a<ColorStateList> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C29240o1 f112826l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29251s1(C29240o1 c29240o1) {
        super(0);
        this.f112826l = c29240o1;
    }

    @Override // Y41.a
    public final ColorStateList invoke() {
        C29240o1 c29240o1 = this.f112826l;
        Context context = c29240o1.f112677M;
        androidx.appcompat.view.d dVar = c29240o1.f112679N;
        UniversalColor universalColorUniversalColorOf = UniversalColorKt.universalColorOf((String) null, C35835l0.d(R.attr.constantWhite, dVar), C35835l0.d(R.attr.gray12, dVar));
        C48063a.f437606a.getClass();
        return C48063a.e(context, universalColorUniversalColorOf);
    }
}
