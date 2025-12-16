package com.avito.android.di.module;

import androidx.fragment.app.Fragment;
import com.avito.android.employee_stub_public.EmployeeStubData;
import kotlin.Metadata;

/* compiled from: SerpTabFragmentFactoryModule.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/fragment/app/Fragment;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.di.module.e9, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C30031e9 extends kotlin.jvm.internal.N implements Y41.a<Fragment> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.employee_stub_impl.d f144282l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30031e9(com.avito.android.employee_stub_impl.d dVar) {
        super(0);
        this.f144282l = dVar;
    }

    @Override // Y41.a
    public final Fragment invoke() {
        return this.f144282l.a(EmployeeStubData.Search.f147623b);
    }
}
