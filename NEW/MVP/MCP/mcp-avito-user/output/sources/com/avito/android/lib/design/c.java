package com.avito.android.lib.design;

import Y41.p;
import android.graphics.Bitmap;
import com.google.android.renderscript.Toolkit;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DesignSystem.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "bitmap", "blurRadius", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class c extends N implements p<Bitmap, Integer, Bitmap> {

    /* renamed from: l, reason: collision with root package name */
    public static final c f178658l = new c();

    public c() {
        super(2);
    }

    @Override // Y41.p
    public final Bitmap invoke(Bitmap bitmap, Integer num) {
        int iIntValue = num.intValue();
        return Toolkit.a(Toolkit.f358945a, bitmap, iIntValue);
    }
}
