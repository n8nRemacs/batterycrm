package com.avito.android.rating_form.item.checkBox;

import com.avito.android.rating_form.FieldIdentifier;
import com.avito.android.rating_form.item.checkBox.CheckableGroupItem;
import ih0.InterfaceC41402a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CheckableGroupItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class i extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CheckableGroupItem f248316l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ j f248317m;

    /* compiled from: CheckableGroupItemPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[CheckableGroupItem.Type.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CheckableGroupItem.Type type = CheckableGroupItem.Type.f248288b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(CheckableGroupItem checkableGroupItem, j jVar) {
        super(0);
        this.f248316l = checkableGroupItem;
        this.f248317m = jVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // Y41.a
    public final G0 invoke() {
        CheckableGroupItem checkableGroupItem = this.f248316l;
        int iOrdinal = checkableGroupItem.f248287g.ordinal();
        ?? r22 = checkableGroupItem.f248286f;
        FieldIdentifier fieldIdentifier = checkableGroupItem.f248283c;
        j jVar = this.f248317m;
        if (iOrdinal == 0) {
            jVar.f248318b.invoke(new InterfaceC41402a.d(fieldIdentifier, r22));
        } else if (iOrdinal == 1) {
            jVar.f248318b.invoke(new InterfaceC41402a.e(fieldIdentifier, r22));
        }
        return G0.f406611a;
    }
}
