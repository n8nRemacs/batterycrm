package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: Error.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B1\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0013\u0010\u001a\u001a\u00020\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u0004\u0018\u00010\u0006J\b\u0010\u001e\u001a\u00020\u0004H\u0016J\b\u0010\u001f\u001a\u00020\u0006H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0010R(\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006 "}, d2 = {"Lcom/avito/android/remote/model/Error;", "Ljava/io/Serializable;", "()V", "code", "", "simpleMessage", "", "messages", "", "(ILjava/lang/String;Ljava/util/Map;)V", "getCode", "()I", "setCode", "(I)V", "isPlural", "", "()Z", "paramsMessages", "getParamsMessages", "()Ljava/util/Map;", "setParamsMessages", "(Ljava/util/Map;)V", "getSimpleMessage", "()Ljava/lang/String;", "setSimpleMessage", "(Ljava/lang/String;)V", "equals", PluralsKeys.OTHER, "", "getOneMessage", "hashCode", "toString", "_common_network-typed-result_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public class Error implements Serializable {

    @c("code")
    private int code;

    @l
    private Map<String, String> paramsMessages;

    @c("message")
    @l
    private String simpleMessage;

    public Error() {
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!getClass().equals(other != null ? other.getClass() : null)) {
            return false;
        }
        Error error = (Error) other;
        if (this.code != error.code) {
            return false;
        }
        String str = this.simpleMessage;
        if (str == null) {
            str = "";
        }
        String str2 = error.simpleMessage;
        if (!str.equals(str2 != null ? str2 : "")) {
            return false;
        }
        Map<String, String> mapC = this.paramsMessages;
        if (mapC == null) {
            mapC = P0.c();
        }
        Map<String, String> mapC2 = error.paramsMessages;
        if (mapC2 == null) {
            mapC2 = P0.c();
        }
        return mapC.equals(mapC2);
    }

    public final int getCode() {
        return this.code;
    }

    @l
    public final String getOneMessage() {
        Collection<String> collectionValues;
        String str = this.simpleMessage;
        if (str != null) {
            return str;
        }
        Map<String, String> map = this.paramsMessages;
        if (map == null || (collectionValues = map.values()) == null) {
            return null;
        }
        return (String) C42745f0.F(collectionValues);
    }

    @l
    public final Map<String, String> getParamsMessages() {
        return this.paramsMessages;
    }

    @l
    public final String getSimpleMessage() {
        return this.simpleMessage;
    }

    public int hashCode() {
        int i12 = this.code * 31;
        String str = this.simpleMessage;
        if (str == null) {
            str = "";
        }
        int iD2 = H.d(i12, 31, str);
        Map<String, String> mapC = this.paramsMessages;
        if (mapC == null) {
            mapC = P0.c();
        }
        return mapC.hashCode() + iD2;
    }

    public final boolean isPlural() {
        return this.paramsMessages != null;
    }

    public final void setCode(int i12) {
        this.code = i12;
    }

    public final void setParamsMessages(@l Map<String, String> map) {
        this.paramsMessages = map;
    }

    public final void setSimpleMessage(@l String str) {
        this.simpleMessage = str;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Error(code=");
        sb2.append(this.code);
        sb2.append(", simpleMessage=");
        sb2.append(this.simpleMessage);
        sb2.append(", paramsMessages=");
        return r.w(sb2, this.paramsMessages, ')');
    }

    public Error(int i12, @l String str, @l Map<String, String> map) {
        this.code = i12;
        this.simpleMessage = str;
        this.paramsMessages = map;
    }

    public /* synthetic */ Error(int i12, String str, Map map, int i13, C42822w c42822w) {
        this(i12, str, (i13 & 4) != 0 ? null : map);
    }
}
