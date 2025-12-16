package com.avito.android.category_items_tree.generated.api.api_1_promo_category_tree_items;

import Vn.b;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: Api1PromoCategoryTreeItemsResponse.kt */
@P
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0014B'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/avito/android/category_items_tree/generated/api/api_1_promo_category_tree_items/Api1PromoCategoryTreeItemsResponse;", "", "Lcom/avito/android/category_items_tree/generated/api/api_1_promo_category_tree_items/Api1PromoCategoryTreeItemsResponse$ActionType;", "actionType", "", "LVn/b;", "items", "", "lastPage", "<init>", "(Lcom/avito/android/category_items_tree/generated/api/api_1_promo_category_tree_items/Api1PromoCategoryTreeItemsResponse$ActionType;Ljava/util/List;Z)V", "Lcom/avito/android/category_items_tree/generated/api/api_1_promo_category_tree_items/Api1PromoCategoryTreeItemsResponse$ActionType;", "a", "()Lcom/avito/android/category_items_tree/generated/api/api_1_promo_category_tree_items/Api1PromoCategoryTreeItemsResponse$ActionType;", "Ljava/util/List;", "b", "()Ljava/util/List;", "Z", "c", "()Z", "ActionType", "_avito_category-items-tree_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class Api1PromoCategoryTreeItemsResponse {

    @c("actionType")
    @l
    private final ActionType actionType;

    @c("items")
    @k
    private final List<b> items;

    @c("lastPage")
    private final boolean lastPage;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Api1PromoCategoryTreeItemsResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/category_items_tree/generated/api/api_1_promo_category_tree_items/Api1PromoCategoryTreeItemsResponse$ActionType;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Button", "Item", "_avito_category-items-tree_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ActionType {

        @c("button")
        public static final ActionType Button;

        @c("item")
        public static final ActionType Item;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ActionType[] f116782b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f116783c;

        static {
            ActionType actionType = new ActionType("Button", 0, "button");
            Button = actionType;
            ActionType actionType2 = new ActionType("Item", 1, "item");
            Item = actionType2;
            ActionType[] actionTypeArr = {actionType, actionType2};
            f116782b = actionTypeArr;
            f116783c = kotlin.enums.c.a(actionTypeArr);
        }

        private ActionType(String str, int i12, String str2) {
        }

        public static ActionType valueOf(String str) {
            return (ActionType) Enum.valueOf(ActionType.class, str);
        }

        public static ActionType[] values() {
            return (ActionType[]) f116782b.clone();
        }
    }

    public Api1PromoCategoryTreeItemsResponse(@l ActionType actionType, @k List<b> list, boolean z12) {
        this.actionType = actionType;
        this.items = list;
        this.lastPage = z12;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final ActionType getActionType() {
        return this.actionType;
    }

    @k
    public final List<b> b() {
        return this.items;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getLastPage() {
        return this.lastPage;
    }
}
