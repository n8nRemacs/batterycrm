package com.avito.android.lib.design.bottom_sheet;

import android.R;
import android.content.res.TypedArray;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BottomSheetDialog.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class f extends N implements Y41.a<Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f178537l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar) {
        super(0);
        this.f178537l = dVar;
    }

    @Override // Y41.a
    public final Boolean invoke() {
        d dVar = this.f178537l;
        boolean z12 = false;
        if (dVar.f178513g && dVar.isShowing()) {
            if (!dVar.f178515i) {
                TypedArray typedArrayObtainStyledAttributes = dVar.getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
                try {
                    boolean z13 = typedArrayObtainStyledAttributes.getBoolean(0, true);
                    typedArrayObtainStyledAttributes.recycle();
                    dVar.f178514h = z13;
                    dVar.f178515i = true;
                } catch (Throwable th2) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th2;
                }
            }
            if (dVar.f178514h) {
                z12 = true;
            }
        }
        return Boolean.valueOf(z12);
    }
}
