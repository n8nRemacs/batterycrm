package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.media3.common.B;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import com.google.common.collect.AbstractC37401r1;
import j.P;
import java.util.ArrayList;
import java.util.List;

@J
/* loaded from: classes.dex */
public final class TextInformationFrame extends Id3Frame {
    public static final Parcelable.Creator<TextInformationFrame> CREATOR = new a();

    /* renamed from: c, reason: collision with root package name */
    @P
    public final String f50690c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC37401r1<String> f50691d;

    public class a implements Parcelable.Creator<TextInformationFrame> {
        @Override // android.os.Parcelable.Creator
        public final TextInformationFrame createFromParcel(Parcel parcel) {
            return new TextInformationFrame(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final TextInformationFrame[] newArray(int i12) {
            return new TextInformationFrame[i12];
        }
    }

    public TextInformationFrame(String str, @P String str2, List<String> list) {
        super(str);
        C23110a.b(!list.isEmpty());
        this.f50690c = str2;
        AbstractC37401r1<String> abstractC37401r1V = AbstractC37401r1.v(list);
        this.f50691d = abstractC37401r1V;
        abstractC37401r1V.get(0);
    }

    public static ArrayList a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // androidx.media3.common.Metadata.Entry
    public final void J5(B.b bVar) throws NumberFormatException {
        String str = this.f50679b;
        str.getClass();
        AbstractC37401r1<String> abstractC37401r1 = this.f50691d;
        char c12 = 65535;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c12 = 0;
                    break;
                }
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c12 = 1;
                    break;
                }
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c12 = 2;
                    break;
                }
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c12 = 3;
                    break;
                }
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c12 = 4;
                    break;
                }
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c12 = 5;
                    break;
                }
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c12 = 6;
                    break;
                }
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c12 = 7;
                    break;
                }
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c12 = '\b';
                    break;
                }
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c12 = '\t';
                    break;
                }
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c12 = '\n';
                    break;
                }
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c12 = 11;
                    break;
                }
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c12 = '\f';
                    break;
                }
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c12 = '\r';
                    break;
                }
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c12 = 14;
                    break;
                }
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c12 = 15;
                    break;
                }
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c12 = 16;
                    break;
                }
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c12 = 17;
                    break;
                }
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c12 = 18;
                    break;
                }
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c12 = 19;
                    break;
                }
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c12 = 20;
                    break;
                }
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c12 = 21;
                    break;
                }
                break;
        }
        try {
            switch (c12) {
                case 0:
                case '\n':
                    bVar.f47188c = abstractC37401r1.get(0);
                    break;
                case 1:
                case 11:
                    bVar.f47210y = abstractC37401r1.get(0);
                    break;
                case 2:
                case '\f':
                    String str2 = abstractC37401r1.get(0);
                    int i12 = Integer.parseInt(str2.substring(2, 4));
                    int i13 = Integer.parseInt(str2.substring(0, 2));
                    bVar.f(Integer.valueOf(i12));
                    bVar.e(Integer.valueOf(i13));
                    break;
                case 3:
                case 17:
                    bVar.f47187b = abstractC37401r1.get(0);
                    break;
                case 4:
                case 18:
                    bVar.f47189d = abstractC37401r1.get(0);
                    break;
                case 5:
                case 19:
                    bVar.f47211z = abstractC37401r1.get(0);
                    break;
                case 6:
                case 20:
                    String[] strArrM = M.M(abstractC37401r1.get(0));
                    int i14 = Integer.parseInt(strArrM[0]);
                    Integer numValueOf = strArrM.length > 1 ? Integer.valueOf(Integer.parseInt(strArrM[1])) : null;
                    bVar.f47198m = Integer.valueOf(i14);
                    bVar.f47199n = numValueOf;
                    break;
                case 7:
                case 16:
                    bVar.f47186a = abstractC37401r1.get(0);
                    break;
                case '\b':
                case 15:
                    bVar.f47209x = abstractC37401r1.get(0);
                    break;
                case '\t':
                case 21:
                    bVar.g(Integer.valueOf(Integer.parseInt(abstractC37401r1.get(0))));
                    break;
                case '\r':
                    ArrayList arrayListA = a(abstractC37401r1.get(0));
                    int size = arrayListA.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                bVar.e((Integer) arrayListA.get(2));
                            }
                        }
                        bVar.f((Integer) arrayListA.get(1));
                    }
                    bVar.g((Integer) arrayListA.get(0));
                    break;
                case 14:
                    ArrayList arrayListA2 = a(abstractC37401r1.get(0));
                    int size2 = arrayListA2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                bVar.f47208w = (Integer) arrayListA2.get(2);
                            }
                        }
                        bVar.f47207v = (Integer) arrayListA2.get(1);
                    }
                    bVar.f47206u = (Integer) arrayListA2.get(0);
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TextInformationFrame.class != obj.getClass()) {
            return false;
        }
        TextInformationFrame textInformationFrame = (TextInformationFrame) obj;
        return M.a(this.f50679b, textInformationFrame.f50679b) && M.a(this.f50690c, textInformationFrame.f50690c) && this.f50691d.equals(textInformationFrame.f50691d);
    }

    public final int hashCode() {
        int iD2 = H.d(527, 31, this.f50679b);
        String str = this.f50690c;
        return this.f50691d.hashCode() + ((iD2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public final String toString() {
        return this.f50679b + ": description=" + this.f50690c + ": values=" + this.f50691d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeString(this.f50679b);
        parcel.writeString(this.f50690c);
        parcel.writeStringArray((String[]) this.f50691d.toArray(new String[0]));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextInformationFrame(Parcel parcel, a aVar) {
        String string = parcel.readString();
        string.getClass();
        String string2 = parcel.readString();
        String[] strArrCreateStringArray = parcel.createStringArray();
        strArrCreateStringArray.getClass();
        this(string, string2, AbstractC37401r1.w(strArrCreateStringArray));
    }
}
