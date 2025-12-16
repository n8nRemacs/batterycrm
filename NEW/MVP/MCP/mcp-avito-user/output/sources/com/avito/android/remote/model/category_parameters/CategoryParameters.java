package com.avito.android.remote.model.category_parameters;

import X41.f;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.gson.d;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.Draft;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.PretendErrorValue;
import com.avito.android.remote.model.category_parameters.base.CategoryParameter;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.ObservableParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.util.H3;
import com.avito.android.util.I3;
import com.avito.android.util.J3;
import com.google.gson.annotations.c;
import io.reactivex.rxjava3.core.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42770s0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.sequences.C43033p;
import kotlin.sequences.o0;

/* compiled from: CategoryParameters.kt */
@s0
@d
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 ~2\u00020\u00012\u00020\u0002:\u0001~By\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u001a\u001a\u00020\u00112\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u001eH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J)\u0010$\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010!*\u00020\u00072\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"H\u0016¢\u0006\u0004\b$\u0010%J-\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\b\b\u0000\u0010!*\u00020\u00072\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0011H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\u00072\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u0019\u0010/\u001a\u0004\u0018\u00010\u00072\u0006\u0010.\u001a\u00020\u000bH\u0016¢\u0006\u0004\b/\u00100J\u0015\u00101\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u0004\u0018\u00010\u00072\u0006\u0010.\u001a\u00020\u000b¢\u0006\u0004\b3\u00100J-\u00104\u001a\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r¢\u0006\u0004\b4\u00105J\u001b\u00106\u001a\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b6\u00107J\u001e\u00109\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010!\u0018\u0001*\u000208H\u0086\b¢\u0006\u0004\b9\u0010:J\u001f\u0010?\u001a\u00020>2\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u00020*H\u0016¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020*H\u0016¢\u0006\u0004\bA\u0010BJ\u0010\u0010C\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\bC\u0010DJ\u0012\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bE\u0010DJ\u0016\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\bF\u00102J\u0018\u0010G\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bG\u00102J\u0012\u0010H\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\bH\u0010IJ\u0018\u0010J\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rHÆ\u0003¢\u0006\u0004\bJ\u0010KJ\u0012\u0010L\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\bL\u0010MJ\u0010\u0010N\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\bN\u0010)J\u0012\u0010O\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\bO\u0010PJ\u0088\u0001\u0010Q\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0004\bQ\u0010RJ\u0010\u0010S\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\bS\u0010IJ\u0010\u0010T\u001a\u00020*HÖ\u0001¢\u0006\u0004\bT\u0010BJ\u001a\u0010W\u001a\u00020\u00112\b\u0010V\u001a\u0004\u0018\u00010UHÖ\u0003¢\u0006\u0004\bW\u0010XJ\u000f\u0010Z\u001a\u00020YH\u0002¢\u0006\u0004\bZ\u0010[JA\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH\u0002¢\u0006\u0004\b^\u0010_J\u0019\u0010b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030a0`H\u0002¢\u0006\u0004\bb\u0010cR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010d\u001a\u0004\be\u0010DR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010d\u001a\u0004\bf\u0010DR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010g\u001a\u0004\bh\u00102R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010g\u001a\u0004\bi\u00102R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010j\u001a\u0004\bk\u0010IR\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010l\u001a\u0004\bm\u0010KR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010n\u001a\u0004\bo\u0010MR\u001a\u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010p\u001a\u0004\bq\u0010)R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010r\u001a\u0004\bs\u0010PR\u0018\u0010t\u001a\u0004\u0018\u00010Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\"\u0010v\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030a\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010wR\u001b\u0010{\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030a0x8F¢\u0006\u0006\u001a\u0004\by\u0010zR\u0014\u0010}\u001a\u00020*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b|\u0010B¨\u0006\u007f"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/CategoryParameters;", "Lcom/avito/android/remote/model/category_parameters/ParametersTree;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/Navigation;", "navigation", "rootNavigation", "", "Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep;", "steps", "", "targetStepId", "", "changedIds", "Lcom/avito/android/remote/model/Draft;", "draft", "", "shouldSaveDraft", "Lcom/avito/android/deep_linking/links/DeepLink;", "redirectUri", "<init>", "(Lcom/avito/android/remote/model/Navigation;Lcom/avito/android/remote/model/Navigation;Ljava/util/List;Ljava/util/List;Ljava/lang/String;[Ljava/lang/String;Lcom/avito/android/remote/model/Draft;ZLcom/avito/android/deep_linking/links/DeepLink;)V", "", "Lcom/avito/android/remote/model/PretendErrorValue;", "pretendResult", "applyPretendResult", "(Ljava/util/Map;)Z", "deepCopy", "()Lcom/avito/android/remote/model/category_parameters/CategoryParameters;", "", "iterator", "()Ljava/util/Iterator;", "T", "Ljava/lang/Class;", "type", "getFirstParameterOfType", "(Ljava/lang/Class;)Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;", "findParametersOfType", "(Ljava/lang/Class;)Ljava/util/List;", "isEmpty", "()Z", "", "position", "getItem", "(I)Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;", "id", "findParameter", "(Ljava/lang/String;)Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;", "getParametersExceptOwnedBySlots", "()Ljava/util/List;", "findParameterHolder", "cloneWithNewParameters", "(Ljava/util/List;[Ljava/lang/String;)Lcom/avito/android/remote/model/category_parameters/CategoryParameters;", "cloneWithNewSteps", "(Ljava/util/List;)Lcom/avito/android/remote/model/category_parameters/CategoryParameters;", "Lcom/avito/android/remote/model/category_parameters/base/CategoryParameter;", "getSingleParameter", "()Lcom/avito/android/remote/model/category_parameters/base/CategoryParameter;", "Landroid/os/Parcel;", "dest", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/avito/android/remote/model/Navigation;", "component2", "component3", "component4", "component5", "()Ljava/lang/String;", "component6", "()[Ljava/lang/String;", "component7", "()Lcom/avito/android/remote/model/Draft;", "component8", "component9", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Lcom/avito/android/remote/model/Navigation;Lcom/avito/android/remote/model/Navigation;Ljava/util/List;Ljava/util/List;Ljava/lang/String;[Ljava/lang/String;Lcom/avito/android/remote/model/Draft;ZLcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/category_parameters/CategoryParameters;", "toString", "hashCode", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Lcom/avito/android/remote/model/category_parameters/SimpleParametersTree;", "getTree", "()Lcom/avito/android/remote/model/category_parameters/SimpleParametersTree;", "oldParams", "newParams", "updateParameters", "(Ljava/util/List;Ljava/util/List;[Ljava/lang/String;)Ljava/util/List;", "Lcom/jakewharton/rxrelay3/c;", "Lcom/avito/android/remote/model/category_parameters/base/EditableParameter;", "createValueChangesRelay", "()Lcom/jakewharton/rxrelay3/c;", "Lcom/avito/android/remote/model/Navigation;", "getNavigation", "getRootNavigation", "Ljava/util/List;", "getParameters", "getSteps", "Ljava/lang/String;", "getTargetStepId", "[Ljava/lang/String;", "getChangedIds", "Lcom/avito/android/remote/model/Draft;", "getDraft", "Z", "getShouldSaveDraft", "Lcom/avito/android/deep_linking/links/DeepLink;", "getRedirectUri", "tree", "Lcom/avito/android/remote/model/category_parameters/SimpleParametersTree;", "valueChangesRelay", "Lcom/jakewharton/rxrelay3/c;", "Lio/reactivex/rxjava3/core/z;", "getValueChanges", "()Lio/reactivex/rxjava3/core/z;", "valueChanges", "getCount", "count", "Companion", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class CategoryParameters implements ParametersTree, Parcelable {

    @f
    @k
    public static final Parcelable.Creator<CategoryParameters> CREATOR;

    @c("changedIds")
    @l
    private final String[] changedIds;

    @c("draft")
    @l
    private final Draft draft;

    @c("navigation")
    @k
    private final Navigation navigation;

    @c("params")
    @k
    private final List<ParameterSlot> parameters;

    @c("redirectUri")
    @l
    private final DeepLink redirectUri;

    @c("rootNavigation")
    @l
    private final Navigation rootNavigation;

    @c("shouldSaveDraft")
    private final boolean shouldSaveDraft;

    @c("steps")
    @l
    private final List<CategoryPublishStep> steps;

    @c("targetStepId")
    @l
    private final String targetStepId;

    @l
    private transient SimpleParametersTree tree;

    @l
    private transient com.jakewharton.rxrelay3.c<EditableParameter<?>> valueChangesRelay;

    static {
        CategoryParameters$Companion$CREATOR$1 categoryParameters$Companion$CREATOR$1 = CategoryParameters$Companion$CREATOR$1.INSTANCE;
        int i12 = I3.f318630a;
        CREATOR = new H3(categoryParameters$Companion$CREATOR$1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CategoryParameters(@k Navigation navigation2, @l Navigation navigation3, @k List<? extends ParameterSlot> list, @l List<? extends CategoryPublishStep> list2, @l String str, @l String[] strArr, @l Draft draft, boolean z12, @l DeepLink deepLink) {
        this.navigation = navigation2;
        this.rootNavigation = navigation3;
        this.parameters = list;
        this.steps = list2;
        this.targetStepId = str;
        this.changedIds = strArr;
        this.draft = draft;
        this.shouldSaveDraft = z12;
        this.redirectUri = deepLink;
    }

    public static /* synthetic */ CategoryParameters cloneWithNewParameters$default(CategoryParameters categoryParameters, List list, String[] strArr, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            strArr = null;
        }
        return categoryParameters.cloneWithNewParameters(list, strArr);
    }

    public static /* synthetic */ CategoryParameters copy$default(CategoryParameters categoryParameters, Navigation navigation2, Navigation navigation3, List list, List list2, String str, String[] strArr, Draft draft, boolean z12, DeepLink deepLink, int i12, Object obj) {
        return categoryParameters.copy((i12 & 1) != 0 ? categoryParameters.navigation : navigation2, (i12 & 2) != 0 ? categoryParameters.rootNavigation : navigation3, (i12 & 4) != 0 ? categoryParameters.parameters : list, (i12 & 8) != 0 ? categoryParameters.steps : list2, (i12 & 16) != 0 ? categoryParameters.targetStepId : str, (i12 & 32) != 0 ? categoryParameters.changedIds : strArr, (i12 & 64) != 0 ? categoryParameters.draft : draft, (i12 & 128) != 0 ? categoryParameters.shouldSaveDraft : z12, (i12 & 256) != 0 ? categoryParameters.redirectUri : deepLink);
    }

    private final com.jakewharton.rxrelay3.c<EditableParameter<?>> createValueChangesRelay() {
        com.jakewharton.rxrelay3.c<EditableParameter<?>> cVar = new com.jakewharton.rxrelay3.c<>();
        SimpleParametersTree tree = getTree();
        ArrayList arrayList = new ArrayList();
        for (ParameterSlot parameterSlot : tree) {
            if (parameterSlot instanceof ObservableParameter) {
                arrayList.add(parameterSlot);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ObservableParameter) it.next()).setValueChangesListener(new CategoryParameters$createValueChangesRelay$1$1(cVar));
        }
        return cVar;
    }

    private final SimpleParametersTree getTree() {
        SimpleParametersTree simpleParametersTree = this.tree;
        if (simpleParametersTree != null) {
            return simpleParametersTree;
        }
        SimpleParametersTree simpleParametersTree2 = new SimpleParametersTree(this.parameters);
        this.tree = simpleParametersTree2;
        return simpleParametersTree2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<ParameterSlot> updateParameters(List<? extends ParameterSlot> oldParams, List<? extends ParameterSlot> newParams, String[] changedIds) {
        if (changedIds == null) {
            return newParams;
        }
        List<? extends ParameterSlot> list = oldParams;
        Set setF = C43033p.F(new o0(new C42770s0(list), CategoryParameters$updateParameters$oldParamIdsSet$1.INSTANCE));
        List<? extends ParameterSlot> list2 = newParams;
        Set setF2 = C43033p.F(new o0(new C42770s0(list2), CategoryParameters$updateParameters$newParamIdsSet$1.INSTANCE));
        ArrayList arrayList = new ArrayList();
        for (String str : changedIds) {
            if (setF.contains(str) && setF2.contains(str)) {
                arrayList.add(str);
            }
        }
        Set setP0 = C42745f0.P0(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : changedIds) {
            if (setF2.contains(str2)) {
                arrayList2.add(str2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (!setF.contains((String) obj)) {
                arrayList3.add(obj);
            }
        }
        Set setP02 = C42745f0.P0(arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : list2) {
            if (setP0.contains(((ParameterSlot) obj2).getId())) {
                arrayList4.add(obj2);
            }
        }
        int iF2 = P0.f(C42745f0.q(arrayList4, 10));
        if (iF2 < 16) {
            iF2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
        for (Object obj3 : arrayList4) {
            linkedHashMap.put(((ParameterSlot) obj3).getId(), obj3);
        }
        ArrayList arrayList5 = new ArrayList();
        for (ParameterSlot parameterSlot : list) {
            ParameterSlot parameterSlot2 = (ParameterSlot) linkedHashMap.get(parameterSlot.getId());
            if (parameterSlot2 != null) {
                parameterSlot = parameterSlot2;
            }
            arrayList5.add(parameterSlot);
        }
        for (Object obj4 : list2) {
            if (setP02.contains(((ParameterSlot) obj4).getId())) {
                arrayList5.add(obj4);
            }
        }
        return arrayList5;
    }

    @Override // com.avito.android.remote.model.category_parameters.ParametersTree
    public boolean applyPretendResult(@l Map<String, ? extends PretendErrorValue> pretendResult) {
        return getTree().applyPretendResult(pretendResult);
    }

    @k
    public final CategoryParameters cloneWithNewParameters(@k List<? extends ParameterSlot> parameters, @l String[] changedIds) {
        return new CategoryParameters(this.navigation, this.rootNavigation, updateParameters(this.parameters, parameters, changedIds), this.steps, null, null, null, false, null, 496, null);
    }

    @k
    public final CategoryParameters cloneWithNewSteps(@k List<? extends CategoryPublishStep> steps) {
        return new CategoryParameters(this.navigation, this.rootNavigation, this.parameters, steps, null, null, null, false, null, 496, null);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final Navigation getNavigation() {
        return this.navigation;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Navigation getRootNavigation() {
        return this.rootNavigation;
    }

    @k
    public final List<ParameterSlot> component3() {
        return this.parameters;
    }

    @l
    public final List<CategoryPublishStep> component4() {
        return this.steps;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final String getTargetStepId() {
        return this.targetStepId;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final String[] getChangedIds() {
        return this.changedIds;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final Draft getDraft() {
        return this.draft;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getShouldSaveDraft() {
        return this.shouldSaveDraft;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final DeepLink getRedirectUri() {
        return this.redirectUri;
    }

    @k
    public final CategoryParameters copy(@k Navigation navigation2, @l Navigation rootNavigation, @k List<? extends ParameterSlot> parameters, @l List<? extends CategoryPublishStep> steps, @l String targetStepId, @l String[] changedIds, @l Draft draft, boolean shouldSaveDraft, @l DeepLink redirectUri) {
        return new CategoryParameters(navigation2, rootNavigation, parameters, steps, targetStepId, changedIds, draft, shouldSaveDraft, redirectUri);
    }

    @k
    public final CategoryParameters deepCopy() {
        List listM0 = C42745f0.M0(this.parameters);
        List<CategoryPublishStep> list = this.steps;
        List listM02 = list != null ? C42745f0.M0(list) : null;
        String[] strArr = this.changedIds;
        return copy$default(this, null, null, listM0, listM02, null, strArr != null ? (String[]) Arrays.copyOf(strArr, strArr.length) : null, null, false, null, 467, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CategoryParameters)) {
            return false;
        }
        CategoryParameters categoryParameters = (CategoryParameters) other;
        return L.f(this.navigation, categoryParameters.navigation) && L.f(this.rootNavigation, categoryParameters.rootNavigation) && L.f(this.parameters, categoryParameters.parameters) && L.f(this.steps, categoryParameters.steps) && L.f(this.targetStepId, categoryParameters.targetStepId) && L.f(this.changedIds, categoryParameters.changedIds) && L.f(this.draft, categoryParameters.draft) && this.shouldSaveDraft == categoryParameters.shouldSaveDraft && L.f(this.redirectUri, categoryParameters.redirectUri);
    }

    @Override // com.avito.android.remote.model.IterableParameters
    @l
    public ParameterSlot findParameter(@k String id2) {
        return getTree().findParameter(id2);
    }

    @l
    public final ParameterSlot findParameterHolder(@k String id2) {
        return getTree().findParameterHolder(id2);
    }

    @Override // com.avito.android.remote.model.IterableParameters
    @k
    public <T extends ParameterSlot> List<T> findParametersOfType(@k Class<T> type) {
        return getTree().findParametersOfType(type);
    }

    @l
    public final String[] getChangedIds() {
        return this.changedIds;
    }

    @Override // com.avito.android.remote.model.category_parameters.ParametersTree, com.avito.android.remote.model.IterableParameters, UV0.a
    public int getCount() {
        return getTree().getCount();
    }

    @l
    public final Draft getDraft() {
        return this.draft;
    }

    @Override // com.avito.android.remote.model.IterableParameters
    @l
    public <T extends ParameterSlot> T getFirstParameterOfType(@k Class<T> type) {
        return (T) getTree().getFirstParameterOfType(type);
    }

    @k
    public final Navigation getNavigation() {
        return this.navigation;
    }

    @k
    public final List<ParameterSlot> getParameters() {
        return this.parameters;
    }

    @Override // com.avito.android.remote.model.category_parameters.ParametersTree
    @k
    public List<ParameterSlot> getParametersExceptOwnedBySlots() {
        return getTree().getParametersExceptOwnedBySlots();
    }

    @l
    public final DeepLink getRedirectUri() {
        return this.redirectUri;
    }

    @l
    public final Navigation getRootNavigation() {
        return this.rootNavigation;
    }

    public final boolean getShouldSaveDraft() {
        return this.shouldSaveDraft;
    }

    public final <T extends CategoryParameter> T getSingleParameter() {
        L.l();
        throw null;
    }

    @l
    public final List<CategoryPublishStep> getSteps() {
        return this.steps;
    }

    @l
    public final String getTargetStepId() {
        return this.targetStepId;
    }

    @k
    public final z<EditableParameter<?>> getValueChanges() {
        com.jakewharton.rxrelay3.c<EditableParameter<?>> cVar = this.valueChangesRelay;
        if (cVar != null) {
            return cVar;
        }
        com.jakewharton.rxrelay3.c<EditableParameter<?>> cVarCreateValueChangesRelay = createValueChangesRelay();
        this.valueChangesRelay = cVarCreateValueChangesRelay;
        return cVarCreateValueChangesRelay;
    }

    public int hashCode() {
        int iHashCode = this.navigation.hashCode() * 31;
        Navigation navigation2 = this.rootNavigation;
        int iE2 = H.e((iHashCode + (navigation2 == null ? 0 : navigation2.hashCode())) * 31, 31, this.parameters);
        List<CategoryPublishStep> list = this.steps;
        int iHashCode2 = (iE2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.targetStepId;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String[] strArr = this.changedIds;
        int iHashCode4 = (iHashCode3 + (strArr == null ? 0 : Arrays.hashCode(strArr))) * 31;
        Draft draft = this.draft;
        int i12 = r.i((iHashCode4 + (draft == null ? 0 : draft.hashCode())) * 31, 31, this.shouldSaveDraft);
        DeepLink deepLink = this.redirectUri;
        return i12 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @Override // com.avito.android.remote.model.category_parameters.ParametersTree, com.avito.android.remote.model.IterableParameters, UV0.a
    public boolean isEmpty() {
        return getTree().isEmpty();
    }

    @Override // com.avito.android.remote.model.IterableParameters, java.lang.Iterable
    @k
    public Iterator<ParameterSlot> iterator() {
        return getTree().iterator();
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CategoryParameters(navigation=");
        sb2.append(this.navigation);
        sb2.append(", rootNavigation=");
        sb2.append(this.rootNavigation);
        sb2.append(", parameters=");
        sb2.append(this.parameters);
        sb2.append(", steps=");
        sb2.append(this.steps);
        sb2.append(", targetStepId=");
        sb2.append(this.targetStepId);
        sb2.append(", changedIds=");
        sb2.append(Arrays.toString(this.changedIds));
        sb2.append(", draft=");
        sb2.append(this.draft);
        sb2.append(", shouldSaveDraft=");
        sb2.append(this.shouldSaveDraft);
        sb2.append(", redirectUri=");
        return a.v(sb2, this.redirectUri, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel dest, int flags) {
        dest.writeParcelable(this.navigation, flags);
        dest.writeParcelable(this.rootNavigation, flags);
        J3.e(this.parameters, dest, 0);
        J3.e(this.steps, dest, 0);
        dest.writeString(this.targetStepId);
        dest.writeInt(this.shouldSaveDraft ? 1 : 0);
    }

    @Override // com.avito.android.remote.model.category_parameters.ParametersTree, com.avito.android.remote.model.IterableParameters, UV0.a
    @k
    public ParameterSlot getItem(int position) {
        return getTree().getItem(position);
    }

    public /* synthetic */ CategoryParameters(Navigation navigation2, Navigation navigation3, List list, List list2, String str, String[] strArr, Draft draft, boolean z12, DeepLink deepLink, int i12, C42822w c42822w) {
        this(navigation2, navigation3, list, (i12 & 8) != 0 ? null : list2, (i12 & 16) != 0 ? null : str, (i12 & 32) != 0 ? null : strArr, (i12 & 64) != 0 ? null : draft, (i12 & 128) != 0 ? true : z12, (i12 & 256) != 0 ? null : deepLink);
    }
}
