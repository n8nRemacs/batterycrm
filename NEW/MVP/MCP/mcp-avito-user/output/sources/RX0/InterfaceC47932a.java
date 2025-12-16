package rx0;

import C11.b;
import Y61.k;
import android.content.res.Resources;
import com.avito.android.analytics.screens.r;
import com.avito.android.di.C;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.di.module.InterfaceC30174s;
import com.avito.android.remote.models.SparePartsGroup;
import com.avito.android.spare_parts.bottom_sheet.SparePartsBottomSheetActivity;
import kotlin.Metadata;

/* compiled from: SparePartsBottomSheetComponent.kt */
@C
@C11.b
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lrx0/a;", "", "a", "b", "_avito_spare-parts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rx0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC47932a {

    /* compiled from: SparePartsBottomSheetComponent.kt */
    @b.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrx0/a$a;", "", "_avito_spare-parts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rx0.a$a, reason: collision with other inner class name */
    public interface InterfaceC12602a {
        @k
        InterfaceC47932a a(@h31.b @k @InterfaceC30174s String str, @h31.b @k SparePartsGroup sparePartsGroup, @h31.b @k Resources resources, @h31.b @k r rVar);
    }

    /* compiled from: SparePartsBottomSheetComponent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrx0/a$b;", "Lcom/avito/android/di/h;", "_avito_spare-parts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @C11.c
    /* renamed from: rx0.a$b */
    public interface b extends InterfaceC29971h {
        @k
        InterfaceC12602a ic();
    }

    void a(@k SparePartsBottomSheetActivity sparePartsBottomSheetActivity);
}
