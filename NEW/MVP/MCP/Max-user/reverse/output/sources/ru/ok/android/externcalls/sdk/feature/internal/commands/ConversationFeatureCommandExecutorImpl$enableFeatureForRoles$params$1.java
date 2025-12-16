package ru.ok.android.externcalls.sdk.feature.internal.commands;

import defpackage.cm6;
import defpackage.u08;
import defpackage.u81;
import defpackage.v81;
import defpackage.w81;
import defpackage.wi1;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lorg/json/JSONObject;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ConversationFeatureCommandExecutorImpl$enableFeatureForRoles$params$1 extends u08 implements cm6 {
    final /* synthetic */ u81 $feature;
    final /* synthetic */ Set<wi1> $roles;
    final /* synthetic */ ConversationFeatureCommandExecutorImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConversationFeatureCommandExecutorImpl$enableFeatureForRoles$params$1(ConversationFeatureCommandExecutorImpl conversationFeatureCommandExecutorImpl, u81 u81Var, Set<? extends wi1> set) {
        super(0);
        this.this$0 = conversationFeatureCommandExecutorImpl;
        this.$feature = u81Var;
        this.$roles = set;
    }

    @Override // defpackage.cm6
    public final JSONObject invoke() throws JSONException {
        String str;
        String str2;
        w81 w81Var = this.this$0.paramsCreator;
        u81 u81Var = this.$feature;
        Set<wi1> set = this.$roles;
        w81Var.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("command", "enable-feature-for-roles");
        int i = v81.$EnumSwitchMapping$0[u81Var.ordinal()];
        if (i == 1) {
            str = "ADD_PARTICIPANT";
        } else if (i == 2) {
            str = "RECORD";
        } else if (i == 3) {
            str = "MOVIE_SHARE";
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            str = "ASR";
        }
        jSONObject.put("feature", str);
        JSONArray jSONArray = new JSONArray();
        Iterator<wi1> it = set.iterator();
        while (it.hasNext()) {
            int i2 = v81.$EnumSwitchMapping$1[it.next().ordinal()];
            if (i2 == 1) {
                str2 = "CREATOR";
            } else if (i2 == 2) {
                str2 = "ADMIN";
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                str2 = "SPEAKER";
            }
            jSONArray.put(str2);
        }
        jSONObject.put("roles", jSONArray);
        return jSONObject;
    }
}
