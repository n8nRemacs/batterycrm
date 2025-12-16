package com.avito.android.beduin.ui.util;

import Y41.l;
import Y61.k;
import com.avito.android.beduin.common.utils.C28809e;
import com.avito.android.beduin_models.BeduinModel;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import lj.InterfaceC43779a;

/* compiled from: ComponentsForms.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_beduin_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b {

    /* compiled from: ComponentsForms.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/beduin_models/BeduinModel;", "invoke", "(Lcom/avito/android/beduin_models/BeduinModel;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements l<BeduinModel, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f104577l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(1);
            this.f104577l = str;
        }

        @Override // Y41.l
        public final Boolean invoke(BeduinModel beduinModel) {
            return Boolean.valueOf(L.f(beduinModel.getF102944b(), this.f104577l));
        }
    }

    @Y61.l
    public static final BeduinModel a(@k InterfaceC43779a interfaceC43779a, @k String str) {
        return (BeduinModel) C42745f0.G(C28809e.b(new a(str), interfaceC43779a.a()));
    }
}
