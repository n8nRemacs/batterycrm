package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Advices.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/avito/android/remote/model/MenuAction;", "", "buttonText", "", "description", "action", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAction", "()Ljava/lang/String;", "getButtonText", "getDescription", "component1", "component2", "component3", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_user-adverts"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class MenuAction {

    @c("action")
    @k
    private final String action;

    @c("buttonText")
    @k
    private final String buttonText;

    @c("description")
    @k
    private final String description;

    public MenuAction(@k String str, @k String str2, @k String str3) {
        this.buttonText = str;
        this.description = str2;
        this.action = str3;
    }

    public static /* synthetic */ MenuAction copy$default(MenuAction menuAction, String str, String str2, String str3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = menuAction.buttonText;
        }
        if ((i12 & 2) != 0) {
            str2 = menuAction.description;
        }
        if ((i12 & 4) != 0) {
            str3 = menuAction.action;
        }
        return menuAction.copy(str, str2, str3);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getButtonText() {
        return this.buttonText;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    @k
    public final MenuAction copy(@k String buttonText, @k String description, @k String action) {
        return new MenuAction(buttonText, description, action);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MenuAction)) {
            return false;
        }
        MenuAction menuAction = (MenuAction) other;
        return L.f(this.buttonText, menuAction.buttonText) && L.f(this.description, menuAction.description) && L.f(this.action, menuAction.action);
    }

    @k
    public final String getAction() {
        return this.action;
    }

    @k
    public final String getButtonText() {
        return this.buttonText;
    }

    @k
    public final String getDescription() {
        return this.description;
    }

    public int hashCode() {
        return this.action.hashCode() + H.d(this.buttonText.hashCode() * 31, 31, this.description);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("MenuAction(buttonText=");
        sb2.append(this.buttonText);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", action=");
        return C22026a.c(sb2, this.action, ')');
    }
}
