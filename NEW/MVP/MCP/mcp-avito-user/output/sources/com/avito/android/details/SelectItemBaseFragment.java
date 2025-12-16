package com.avito.android.details;

import Me.m;
import Zp0.InterfaceC19587b;
import Zp0.InterfaceC19588c;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.details.j;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.select.Arguments;
import com.avito.android.select.auto_early_access_select.AutoEarlyAccessSelectDialogFragment;
import com.avito.android.select.auto_early_access_select.AutoEarlyAccessSelectParams;
import com.avito.android.select.p;
import com.avito.android.select.t;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.H2;
import com.avito.android.util.K2;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import shark.AndroidResourceIdNames;

/* compiled from: SelectItemBaseFragment.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/details/SelectItemBaseFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/select/p;", "Lcom/avito/android/select/t;", "Lcom/avito/android/details/j$b;", "<init>", "()V", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class SelectItemBaseFragment extends BaseFragment implements p, t, j.b {

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public b f135892n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final Handler f135893o0;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f135894p0;

    /* renamed from: q0, reason: collision with root package name */
    @Y61.l
    public H2 f135895q0;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.l
    public List<? extends ParcelableEntity<String>> f135896r0;

    /* compiled from: SelectItemBaseFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "keyboardShown", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<Boolean, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Boolean bool) {
            SelectItemBaseFragment.this.f135894p0 = bool.booleanValue();
            return G0.f406611a;
        }
    }

    public SelectItemBaseFragment() {
        super(0, 1, null);
        this.f135893o0 = new Handler();
    }

    @Override // com.avito.android.select.p
    @Y61.l
    public final InterfaceC19588c<? super InterfaceC19587b> E4(@Y61.k Arguments arguments) {
        b bVar = this.f135892n0;
        if (bVar == null) {
            bVar = null;
        }
        return bVar.E4(arguments);
    }

    @Override // com.avito.android.details.j.b
    public final void O2(@Y61.k AutoEarlyAccessSelectParams autoEarlyAccessSelectParams) {
        if (!this.f135894p0) {
            q5(autoEarlyAccessSelectParams);
            return;
        }
        View view = getView();
        if (view != null) {
            K2.d(view, true);
        }
        this.f135893o0.postDelayed(new f(this, autoEarlyAccessSelectParams, 1), 200L);
    }

    @Override // com.avito.android.details.j.b
    public final void R1(@Y61.k Arguments arguments) {
        if (!this.f135894p0) {
            r5(arguments);
            return;
        }
        View view = getView();
        if (view != null) {
            K2.d(view, true);
        }
        this.f135893o0.postDelayed(new f(this, arguments, 2), 200L);
    }

    @Override // com.avito.android.select.p
    public final void j(@Y61.k String str, @Y61.l String str2, @Y61.k List list) {
        this.f135893o0.post(new m(this, str, list, 16));
        this.f135896r0 = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        H2 h22 = this.f135895q0;
        if (h22 != null) {
            h22.dispose();
        }
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ActivityC22955m activityC22955mL1 = l1();
        this.f135895q0 = activityC22955mL1 != null ? K2.a(activityC22955mL1, new a()) : null;
    }

    @Override // com.avito.android.select.t
    @Y61.l
    public final List<ParcelableEntity<String>> p3() {
        return this.f135896r0;
    }

    @Override // com.avito.android.select.p
    public final void q(@Y61.k String str) {
        this.f135896r0 = null;
    }

    public final void q5(AutoEarlyAccessSelectParams autoEarlyAccessSelectParams) {
        AutoEarlyAccessSelectDialogFragment.f264982j0.getClass();
        AutoEarlyAccessSelectDialogFragment autoEarlyAccessSelectDialogFragment = new AutoEarlyAccessSelectDialogFragment();
        autoEarlyAccessSelectDialogFragment.f264985i0.setValue(autoEarlyAccessSelectDialogFragment, AutoEarlyAccessSelectDialogFragment.f264983k0[0], autoEarlyAccessSelectParams);
        autoEarlyAccessSelectDialogFragment.setTargetFragment(this, 0);
        autoEarlyAccessSelectDialogFragment.show(getParentFragmentManager(), "select_fragment");
    }

    public final void r5(Arguments arguments) {
        Arguments argumentsCopy;
        if (isAdded()) {
            if (arguments.getVariants().size() > 100) {
                this.f135896r0 = arguments.getVariants();
                argumentsCopy = arguments.copy(((-9) & 1) != 0 ? arguments.isRedesigned : false, ((-9) & 2) != 0 ? arguments.requestId : null, ((-9) & 4) != 0 ? arguments.groups : null, ((-9) & 8) != 0 ? arguments.variants : C42784z0.f406748b, ((-9) & 16) != 0 ? arguments.selected : null, ((-9) & 32) != 0 ? arguments.title : null, ((-9) & 64) != 0 ? arguments.description : null, ((-9) & 128) != 0 ? arguments.showSearch : false, ((-9) & 256) != 0 ? arguments.hideHeader : false, ((-9) & 512) != 0 ? arguments.showSearchClearButton : false, ((-9) & 1024) != 0 ? arguments.multiSelect : false, ((-9) & 2048) != 0 ? arguments.canClear : false, ((-9) & 4096) != 0 ? arguments.requestFocus : false, ((-9) & 8192) != 0 ? arguments.areGroupsCollapsible : false, ((-9) & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? arguments.typoCorrectionEnabled : false, ((-9) & 32768) != 0 ? arguments.attributeId : null, ((-9) & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? arguments.withImages : false, ((-9) & 131072) != 0 ? arguments.titlePattern : null, ((-9) & 262144) != 0 ? arguments.imageParams : null, ((-9) & 524288) != 0 ? arguments.confirmButtonTitle : null, ((-9) & 1048576) != 0 ? arguments.variantIdForEmptySearch : null, ((-9) & 2097152) != 0 ? arguments.isFromFilters : false, ((-9) & 4194304) != 0 ? arguments.isFromInlineFilters : false, ((-9) & 8388608) != 0 ? arguments.isPaginationSuggest : false, ((-9) & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? arguments.withLeftIcon : false, ((-9) & 33554432) != 0 ? arguments.needFooter : false, ((-9) & 67108864) != 0 ? arguments.hideClear : false, ((-9) & 134217728) != 0 ? arguments.showCloseButton : false, ((-9) & 268435456) != 0 ? arguments.defaultValue : null, ((-9) & 536870912) != 0 ? arguments.optionImageSize : null, ((-9) & 1073741824) != 0 ? arguments.searchParams : null, ((-9) & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? arguments.candy : false, (255 & 1) != 0 ? arguments.isChips : false, (255 & 2) != 0 ? arguments.itemsStyle : null, (255 & 4) != 0 ? arguments.submitButtonEnabled : false, (255 & 8) != 0 ? arguments.isFullScreen : false, (255 & 16) != 0 ? arguments.isSectionedPagination : false, (255 & 32) != 0 ? arguments.titleMaxLinesCount : 0, (255 & 64) != 0 ? arguments.searchErrorTextRes : null, (255 & 128) != 0 ? arguments.searchErrorGravity : null);
            } else {
                argumentsCopy = arguments;
            }
            com.avito.android.select.bottom_sheet.c.a(this, argumentsCopy).show(getParentFragmentManager(), "select_fragment");
        }
    }

    @Override // com.avito.android.details.j.b
    public final void t3(@Y61.k com.avito.android.blueprints.selector_card_group_bottom_sheet.k kVar) {
        if (!this.f135894p0) {
            new com.avito.android.blueprints.selector_card_group_bottom_sheet.d(requireContext(), kVar, new g(this, kVar)).V();
            return;
        }
        View view = getView();
        if (view != null) {
            K2.d(view, true);
        }
        this.f135893o0.postDelayed(new f(this, kVar, 0), 200L);
    }

    @Override // com.avito.android.select.p
    public final void s3(@Y61.k String str) {
    }
}
