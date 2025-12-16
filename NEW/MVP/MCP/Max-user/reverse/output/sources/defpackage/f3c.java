package defpackage;

import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class f3c implements Parcelable {
    public static final Parcelable.Creator<f3c> CREATOR = new wcb(11);
    public final int X;
    public final CharSequence Y;
    public final long Z;
    public final int a;
    public final long b;
    public final long c;
    public final float d;
    public final long o;
    public final AbstractCollection s0;
    public final long t0;
    public final Bundle u0;
    public PlaybackState v0;

    public f3c(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, ArrayList arrayList, long j5, Bundle bundle) {
        AbstractCollection arrayList2;
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = f;
        this.o = j3;
        this.X = i2;
        this.Y = charSequence;
        this.Z = j4;
        if (arrayList == null) {
            t76 t76Var = wg7.b;
            arrayList2 = zjd.o;
        } else {
            arrayList2 = new ArrayList(arrayList);
        }
        this.s0 = arrayList2;
        this.t0 = j5;
        this.u0 = bundle;
    }

    public static f3c a(PlaybackState playbackState) {
        ArrayList arrayList = null;
        if (playbackState == null) {
            return null;
        }
        List<PlaybackState.CustomAction> customActions = playbackState.getCustomActions();
        if (customActions != null) {
            arrayList = new ArrayList(customActions.size());
            for (PlaybackState.CustomAction customAction : customActions) {
                if (customAction != null) {
                    Bundle extras = customAction.getExtras();
                    h79.w(extras);
                    e3c e3cVar = new e3c(customAction.getAction(), customAction.getName(), customAction.getIcon(), extras);
                    e3cVar.o = customAction;
                    arrayList.add(e3cVar);
                }
            }
        }
        Bundle extras2 = playbackState.getExtras();
        h79.w(extras2);
        f3c f3cVar = new f3c(playbackState.getState(), playbackState.getPosition(), playbackState.getBufferedPosition(), playbackState.getPlaybackSpeed(), playbackState.getActions(), 0, playbackState.getErrorMessage(), playbackState.getLastPositionUpdateTime(), arrayList, playbackState.getActiveQueueItemId(), extras2);
        f3cVar.v0 = playbackState;
        return f3cVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {state=");
        sb.append(this.a);
        sb.append(", position=");
        sb.append(this.b);
        sb.append(", buffered position=");
        sb.append(this.c);
        sb.append(", speed=");
        sb.append(this.d);
        sb.append(", updated=");
        sb.append(this.Z);
        sb.append(", actions=");
        sb.append(this.o);
        sb.append(", error code=");
        sb.append(this.X);
        sb.append(", error message=");
        sb.append(this.Y);
        sb.append(", custom actions=");
        sb.append(this.s0);
        sb.append(", active item id=");
        return ho7.k(sb, this.t0, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeLong(this.b);
        parcel.writeFloat(this.d);
        parcel.writeLong(this.Z);
        parcel.writeLong(this.c);
        parcel.writeLong(this.o);
        TextUtils.writeToParcel(this.Y, parcel, i);
        parcel.writeTypedList(this.s0);
        parcel.writeLong(this.t0);
        parcel.writeBundle(this.u0);
        parcel.writeInt(this.X);
    }

    public f3c(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readLong();
        this.d = parcel.readFloat();
        this.Z = parcel.readLong();
        this.c = parcel.readLong();
        this.o = parcel.readLong();
        this.Y = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        AbstractCollection abstractCollectionCreateTypedArrayList = parcel.createTypedArrayList(e3c.CREATOR);
        if (abstractCollectionCreateTypedArrayList == null) {
            t76 t76Var = wg7.b;
            abstractCollectionCreateTypedArrayList = zjd.o;
        }
        this.s0 = abstractCollectionCreateTypedArrayList;
        this.t0 = parcel.readLong();
        this.u0 = parcel.readBundle(h79.class.getClassLoader());
        this.X = parcel.readInt();
    }
}
