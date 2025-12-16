package com.akita.compose.theme.re23.preview;

import android.content.Context;
import android.widget.Toast;
import java.util.List;
import kotlin.Metadata;

/* compiled from: DatePickerPreviewImpl.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lkotlin/ranges/o;", "it", "Lkotlin/G0;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class E1 extends kotlin.jvm.internal.N implements Y41.l<List<? extends kotlin.ranges.o>, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f65316l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E1(Context context) {
        super(1);
        this.f65316l = context;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(List<? extends kotlin.ranges.o> list) {
        Toast.makeText(this.f65316l, "Выбраные даты изменены", 0).show();
        return kotlin.G0.f406611a;
    }
}
