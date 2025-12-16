package com.avito.android.remote.parse.adapter.messenger;

import Rk0.C15052b;
import Rk0.C15053c;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.messenger.PlatformSupport;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.messenger.context_actions.ItemsRequest;
import com.avito.android.remote.model.messenger.context_actions.PlatformActions;
import com.avito.android.util.C2;
import com.avito.android.util.V2;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.o;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ContextActionsTypeAdapter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/parse/adapter/messenger/ContextActionsTypeAdapter;", "Lcom/google/gson/h;", "LW81/a;", "Lcom/google/gson/o;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ContextActionsTypeAdapter implements h<W81.a>, o<W81.a> {

    /* compiled from: Gsons.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/util/P1", "Lcom/google/gson/reflect/a;", "_common_gson_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends com.google.gson.reflect.a<ContextActionHandler.MethodCall> {
    }

    public static PlatformActions.ExpandableData b(g gVar, i iVar) {
        if (iVar == null || (iVar instanceof j)) {
            return null;
        }
        if (iVar instanceof k) {
            k kVarI = iVar.i();
            return new PlatformActions.ExpandableData(C2.c(kVarI, PlatformActions.ExpandableData.TITLE_SHORT), (ContextActionHandler.MethodCall) gVar.b(kVarI.D(PlatformActions.ExpandableData.CANCEL_ACTION), new a().getType()));
        }
        throw new IllegalArgumentException("Expected null or object, but got: " + iVar);
    }

    public static i c(n nVar, PlatformActions.ExpandableData expandableData) {
        if (expandableData == null) {
            return j.f362193b;
        }
        k kVar = new k();
        kVar.y(PlatformActions.ExpandableData.TITLE_SHORT, expandableData.getTitleShort());
        kVar.t(PlatformActions.ExpandableData.CANCEL_ACTION, nVar.c(expandableData.getCancelHandler()));
        return kVar;
    }

    @Override // com.google.gson.o
    public final i a(Object obj, n nVar) {
        W81.a aVar = (W81.a) obj;
        if (aVar instanceof PlatformActions.Actions) {
            k kVar = new k();
            PlatformActions.Actions actions = (PlatformActions.Actions) aVar;
            kVar.y(PlatformActions.MESSAGE_ID, actions.getMessageId());
            kVar.t(PlatformActions.PLATFORM_SUPPORT, nVar.a(actions.getPlatformSupport(), PlatformSupport.class));
            kVar.w(actions.getVersion(), "version");
            k kVar2 = new k();
            kVar2.t("title", nVar.c(actions.getTitle()));
            kVar2.t("actions", nVar.a(actions.getActions(), new C15053c().getType()));
            kVar2.t(PlatformActions.EXPANDABLE, c(nVar, actions.getExpandableData()));
            kVar2.t(PlatformActions.MULTI_BUTTONS, actions.getMultiButtonsData() != null ? new k() : j.f362193b);
            kVar2.t(PlatformActions.HIDE_KEYBOARD, nVar.c(Boolean.valueOf(actions.getHideKeyboard())));
            G0 g02 = G0.f406611a;
            kVar.t("value", kVar2);
            return kVar;
        }
        if (!(aVar instanceof PlatformActions.ItemsList)) {
            if (!(aVar instanceof PlatformActions.None)) {
                return j.f362193b;
            }
            k kVar3 = new k();
            PlatformActions.None none = (PlatformActions.None) aVar;
            kVar3.y(PlatformActions.MESSAGE_ID, none.getMessageId());
            kVar3.t(PlatformActions.PLATFORM_SUPPORT, nVar.a(none.getPlatformSupport(), PlatformSupport.class));
            kVar3.w(none.getVersion(), "version");
            return kVar3;
        }
        k kVar4 = new k();
        PlatformActions.ItemsList itemsList = (PlatformActions.ItemsList) aVar;
        kVar4.y(PlatformActions.MESSAGE_ID, itemsList.getMessageId());
        kVar4.y("type", PlatformActions.ItemsList.TYPE);
        kVar4.w(itemsList.getVersion(), "version");
        kVar4.t(PlatformActions.PLATFORM_SUPPORT, nVar.a(itemsList.getPlatformSupport(), PlatformSupport.class));
        k kVar5 = new k();
        kVar5.t("title", nVar.c(itemsList.getTitle()));
        kVar5.t(PlatformActions.ItemsList.ITEMS_REQUEST, nVar.a(itemsList.getItemsRequest(), ItemsRequest.class));
        kVar5.t(PlatformActions.EXPANDABLE, c(nVar, itemsList.getExpandableData()));
        kVar5.t(PlatformActions.HIDE_KEYBOARD, nVar.c(Boolean.valueOf(itemsList.getHideKeyboard())));
        G0 g03 = G0.f406611a;
        kVar4.t("value", kVar5);
        return kVar4;
    }

    @Override // com.google.gson.h
    public final W81.a deserialize(i iVar, Type type, g gVar) {
        W81.a none;
        PlatformActions.MultiButtonsData multiButtonsData = null;
        if (iVar instanceof j) {
            return new PlatformActions.None(null);
        }
        if (!(iVar instanceof k)) {
            V2.f318762a.d("ContextActionsTypeAdapter", "Unexpected json: " + iVar);
            return new PlatformActions.None(null);
        }
        k kVarI = iVar.i();
        String strC = C2.c(kVarI, "type");
        i iVarD = kVarI.D("value");
        String strC2 = C2.c(kVarI, PlatformActions.MESSAGE_ID);
        i iVarD2 = kVarI.D(PlatformActions.PLATFORM_SUPPORT);
        Long lB2 = C2.b(kVarI, "version");
        if (iVarD == null || (iVarD instanceof j)) {
            none = new PlatformActions.None(lB2);
        } else if (iVarD instanceof k) {
            Boolean boolA = C2.a(iVarD.i(), PlatformActions.HIDE_KEYBOARD);
            boolean zBooleanValue = boolA != null ? boolA.booleanValue() : false;
            if (L.f(strC, PlatformActions.ItemsList.TYPE)) {
                k kVarI2 = iVarD.i();
                try {
                    PlatformActions.ExpandableData expandableDataB = b(gVar, kVarI2.D(PlatformActions.EXPANDABLE));
                    none = expandableDataB == null ? new PlatformActions.None(lB2) : new PlatformActions.ItemsList(kVarI2.D("title").s(), (ItemsRequest) gVar.b(kVarI2.D(PlatformActions.ItemsList.ITEMS_REQUEST), ItemsRequest.class), strC2, (PlatformSupport) gVar.b(iVarD2, PlatformSupport.class), lB2, expandableDataB, zBooleanValue);
                } catch (Exception unused) {
                    V2.f318762a.d("ContextActionsTypeAdapter", "Failed to parse items list from json=" + kVarI2);
                    none = new PlatformActions.None(lB2);
                }
            } else {
                k kVarI3 = iVarD.i();
                try {
                    String strC3 = C2.c(kVarI3, "title");
                    List list = (List) gVar.b(kVarI3.D("actions"), new C15052b().getType());
                    PlatformSupport platformSupport = (PlatformSupport) gVar.b(iVarD2, PlatformSupport.class);
                    PlatformActions.ExpandableData expandableDataB2 = b(gVar, kVarI3.D(PlatformActions.EXPANDABLE));
                    i iVarD3 = kVarI3.D(PlatformActions.MULTI_BUTTONS);
                    if (iVarD3 != null && !(iVarD3 instanceof j)) {
                        if (!(iVarD3 instanceof k)) {
                            throw new IllegalArgumentException("Expected null or object, but got: " + iVarD3);
                        }
                        multiButtonsData = PlatformActions.MultiButtonsData.INSTANCE;
                    }
                    return new PlatformActions.Actions(strC3, list, strC2, platformSupport, lB2, expandableDataB2, zBooleanValue, multiButtonsData);
                } catch (Exception unused2) {
                    V2.f318762a.d("ContextActionsTypeAdapter", "Failed to parse context actions from json=" + kVarI3);
                    none = new PlatformActions.None(lB2);
                }
            }
        } else {
            V2.f318762a.d("ContextActionsTypeAdapter", "Unexpected value: " + iVarD);
            none = new PlatformActions.None(lB2);
        }
        return none;
    }
}
