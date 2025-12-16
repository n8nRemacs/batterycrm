package com.avito.android.ai_assistant;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AssistantChatArguments.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ai_assistant/AssistantChatArguments;", "Landroid/os/Parcelable;", "_avito_ai-assistant_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AssistantChatArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<AssistantChatArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f88716b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f88717c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f88718d;

    /* compiled from: AssistantChatArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AssistantChatArguments> {
        @Override // android.os.Parcelable.Creator
        public final AssistantChatArguments createFromParcel(Parcel parcel) {
            return new AssistantChatArguments(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final AssistantChatArguments[] newArray(int i12) {
            return new AssistantChatArguments[i12];
        }
    }

    public AssistantChatArguments() {
        this(null, null, false, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssistantChatArguments)) {
            return false;
        }
        AssistantChatArguments assistantChatArguments = (AssistantChatArguments) obj;
        return L.f(this.f88716b, assistantChatArguments.f88716b) && L.f(this.f88717c, assistantChatArguments.f88717c) && this.f88718d == assistantChatArguments.f88718d;
    }

    public final int hashCode() {
        int iHashCode = this.f88716b.hashCode() * 31;
        String str = this.f88717c;
        return Boolean.hashCode(this.f88718d) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AssistantChatArguments(context=");
        sb2.append(this.f88716b);
        sb2.append(", chatId=");
        sb2.append(this.f88717c);
        sb2.append(", isFirstStart=");
        return r.x(sb2, this.f88718d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f88716b);
        parcel.writeString(this.f88717c);
        parcel.writeInt(this.f88718d ? 1 : 0);
    }

    public AssistantChatArguments(@k String str, @l String str2, boolean z12) {
        this.f88716b = str;
        this.f88717c = str2;
        this.f88718d = z12;
    }

    public /* synthetic */ AssistantChatArguments(String str, String str2, boolean z12, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "" : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? true : z12);
    }
}
